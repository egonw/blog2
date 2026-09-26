// License: MIT
//
// Formats the DOIs found in the tags (doi:, justdoi:, cito:, mycito:) of posts, tag pages, and work pages as APA
// with citation.js, and caches the results in _data/references.json (DOI -> HTML).
// Only DOIs not yet in the cache are looked up. The layouts add icons and links,
// see _includes/references.html.

const fs = require('fs')
const path = require('path')
const Cite = require('citation-js')

const cacheFile = '_data/references.json'
const cache = fs.existsSync(cacheFile) ? JSON.parse(fs.readFileSync(cacheFile, 'utf8')) : {}

// collect the DOIs from the tag:, tags:, and cited-in: fields in the front matter, like the layouts do
const dois = new Set()
for (const dir of ['_posts', 'tag', 'work']) {
  for (const file of fs.readdirSync(dir, { recursive: true })) {
    if (path.basename(file).startsWith('template') || !/\.(markdown|md)$/.test(file)) continue
    const header = fs.readFileSync(path.join(dir, file), 'utf8').split(/^---\s*$/m)[1] || ''
    for (const tagLines of header.matchAll(/^(tags?|cited-in):.*(\n[ \t]+.*)*/gm)) {
      for (const tag of tagLines[0].replace(/^(tags?|cited-in):/, '').split(/\s+/)) {
        const check = tag.split(':')
        if (check.length > 1 && (check[0] === 'doi' || check[0] === 'justdoi')) dois.add(check[1])
        // cito:intent1,intent2:DOI and mycito:intent1,intent2:DOI
        if (check.length > 2 && (check[0] === 'cito' || check[0] === 'mycito')) dois.add(check[2])
      }
    }
  }
}

async function main () {
  const missing = [...dois].filter(doi => !(doi in cache))
  console.log(`${dois.size} DOIs, ${missing.length} not yet cached`)
  for (const doi of missing) {
    try {
      const cite = await Cite.async(doi)
      const html = cite.format('bibliography', { format: 'html', template: 'apa' })
      // keep only the entry itself, without the csl-bib-body and csl-entry wrappers
      cache[doi] = html.match(/class="csl-entry">([\s\S]*)<\/div>\s*<\/div>\s*$/)[1].trim()
      console.log(`Formatted ${doi}`)
    } catch (error) {
      console.error(`Failed ${doi}: ${error.message}`)
    }
  }
  const sorted = Object.fromEntries(Object.keys(cache).sort().map(doi => [doi, cache[doi]]))
  fs.mkdirSync('_data', { recursive: true })
  fs.writeFileSync(cacheFile, JSON.stringify(sorted, null, 2) + '\n')
}

main()
