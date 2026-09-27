// Copyright (c) 2025-2026  Egon Willighagen <egon.willighagen@gmail.com>
//
// GPL v3

@Grab(group='io.github.egonw.bacting', module='managers-ui', version='1.0.12')

import java.text.SimpleDateFormat;
import java.util.Date;
import groovy.io.FileType

String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

ui = new net.bioclipse.managers.UIManager("..");

mappings = [
  "2023/08/last-post-here-freebie-model-online.html": "2023/08/18/last-post-here-freebie-model-online.html",
  "2022/05/new-providing-adverse-outcome-pathways.html": "2022/05/17/new-providing-adverse-outcome-pathways.html",
  "2021/06/conflict-of-interest-or-why-i-am.html": "2021/06/11/conflict-of-interest-or-why-i-am.html",
  "2020/11/cito-updates-1-first-research-paper-in.html": "2020/11/01/cito-updates-1-first-research-paper-in.html",
  "2020/03/new-paper-wikidata-as-knowledge-graph.html": "2020/03/19/new-paper-wikidata-as-knowledge-graph.html",
  "2015/03/what-youre-doing-is-rather-desperate.html": "2015/03/22/what-youre-doing-is-rather-desperate.html",
  "2011/09/almost-year-ago-i-started-position-with.html": "2011/09/27/almost-year-ago-i-started-position-with.html",
  "2011/06/chiral-molecules-how-cool-is-sem.html": "2011/06/25/chiral-molecules-how-cool-is-sem.html",
  "2010/12/text-mining-chemistry-from-dutch-or.html": "2010/12/30/text-mining-chemistry-from-dutch-or.html",
  "2010/12/supramolecular-chemistry.html": "2010/12/11/supramolecular-chemistry.html",
  "2010/12/status-update-on-bjoc-analysis-with_11.html": "2010/12/11/status-update-on-bjoc-analysis-with_11.html",
  "2010/12/status-update-on-bjoc-analysis-with.html": "2010/12/11/status-update-on-bjoc-analysis-with.html",
  "2010/10/multiple-unit-test-inheritance-with.html": "2010/10/26/multiple-unit-test-inheritance-with.html",
  "2010/10/working-on-oscar-for-three-months.html": "2010/10/15/working-on-oscar-for-three-months.html",
  "2010/08/skyline-of-boston-walking-to-convention.html": "2010/08/22/skyline-of-boston-walking-to-convention.html",
  "2010/08/specifying-unit-test-dependencies-with.html": "2010/08/14/specifying-unit-test-dependencies-with.html",
  "2010/08/xhtmlrdfa-template.html": "2010/08/09/xhtmlrdfa-template.html",
  "2010/08/cleaner-cdk-code-7-understand-what-code.html": "2010/08/05/cleaner-cdk-code-7-understand-what-code.html",
  "2010/08/oxford.html": "2010/08/01/oxford.html",
  "2010/07/scripts-logs-as-htmlrdfa-mix-free-text.html": "2010/07/19/scripts-logs-as-htmlrdfa-mix-free-text.html",
  "2010/07/rdfadev-htmlrdfa-development-with.html": "2010/07/16/rdfadev-htmlrdfa-development-with.html",
  "2010/07/cb-new-blogs-13.html": "2010/07/15/cb-new-blogs-13.html",
  "2010/06/it-is-my-great-pleasure-to-present-full.html": "2010/06/26/it-is-my-great-pleasure-to-present-full.html",
  "2010/06/critical-mass-for-open-notebook-science.html": "2010/06/26/critical-mass-for-open-notebook-science.html",
  "2010/05/my-opentox-workshop-contribution.html": "2010/05/30/my-opentox-workshop-contribution.html",
  "2010/05/cleaner-cdk-code-6-set-cdkexceptions.html": "2010/05/21/cleaner-cdk-code-6-set-cdkexceptions.html",
  "2010/05/cleaner-cdk-code-5-developer-against.html": "2010/05/15/cleaner-cdk-code-5-developer-against.html",
  "2010/05/github-simplifies-code-review-and.html": "2010/05/10/github-simplifies-code-review-and.html",
  "2010/05/web-20-technologies-in-student.html": "2010/05/08/web-20-technologies-in-student.html",
  "2010/04/cip-rules-for-stereochemistry.html": "2010/04/22/cip-rules-for-stereochemistry.html",
  "2010/04/bittorrents-for-science.html": "2010/04/18/bittorrents-for-science.html",
  "2010/04/cdk-jchempaint-3-rendering-parameters.html": "2010/04/05/cdk-jchempaint-3-rendering-parameters.html",
  "2010/04/cdk-jchempaint-2-rendering-reactions.html": "2010/04/05/cdk-jchempaint-2-rendering-reactions.html",
  "2010/04/cdk-jchempaint-1-rendering-molecules.html": "2010/04/05/cdk-jchempaint-1-rendering-molecules.html",
  "2010/03/cleaner-cdk-code-4-inheriting-javadoc.html": "2010/03/30/cleaner-cdk-code-4-inheriting-javadoc.html",
  "2010/03/cdk-taverna-paper-published.html": "2010/03/29/cdk-taverna-paper-published.html",
  "2010/03/cleaner-cdk-code-3-run-pmd-tests.html": "2010/03/26/cleaner-cdk-code-3-run-pmd-tests.html",
  "2010/03/rdf-powered-qsar-wizard-sparql-end.html": "2010/03/15/rdf-powered-qsar-wizard-sparql-end.html",
  "2010/03/cleaner-cdk-code-1-list-and-for-each.html": "2010/03/07/cleaner-cdk-code-1-list-and-for-each.html",
  "2010/03/oochemistry-01-released-call-for.html": "2010/03/06/oochemistry-01-released-call-for.html",
  "2010/03/rdf-jena-bioclipse-eclipse-zest-2-icons.html": "2010/03/04/rdf-jena-bioclipse-eclipse-zest-2-icons.html",
  "2010/02/further-statistics-on-papers-citing-cdk.html": "2010/02/22/further-statistics-on-papers-citing-cdk.html",
  "2010/02/wordle-of-titles-of-20-most-recent.html": "2010/02/21/wordle-of-titles-of-20-most-recent.html",
  "2010/02/open-data-panton-principles.html": "2010/02/19/open-data-panton-principles.html",
  "2010/02/citing-chemistry-development-kit.html": "2010/02/18/citing-chemistry-development-kit.html",
  "2010/02/bioclipse-understands-ontologies-note.html": "2010/02/11/bioclipse-understands-ontologies-note.html",
  "2010/02/chembl-rdf-1sparql-end-point.html": "2010/02/09/chembl-rdf-1sparql-end-point.html",
  "2010/01/cdk-125-changes.html": "2010/01/30/cdk-125-changes.html",
  "2010/01/semantic-web-features-in-bioclipse-22.html": "2010/01/28/semantic-web-features-in-bioclipse-22.html",
  "2010/01/semantic-chemistry-with-resource.html": "2010/01/25/semantic-chemistry-with-resource.html",
  "2009/12/cdk-131-changes.html": "2009/12/02/cdk-131-changes.html",
  "2009/11/swat4ls-wrapping-up-1.html": "2009/11/25/swat4ls-wrapping-up-1.html",
  "2009/11/swat4ls-linking-open-drug-data-to.html": "2009/11/21/swat4ls-linking-open-drug-data-to.html",
  "2009/11/open-notebook-science-solubility-sparql.html": "2009/11/19/open-notebook-science-solubility-sparql.html",
  "2009/11/chempedia-rdf-1-sparql-end-point.html": "2009/11/19/chempedia-rdf-1-sparql-end-point.html",
  "2009/11/cdk-124-changes.html": "2009/11/18/cdk-124-changes.html",
  "2009/11/bioclipse-manager-for-myexperimentorg.html": "2009/11/04/bioclipse-manager-for-myexperimentorg.html",
  "2009/10/work-in-progress-open-doccheck.html": "2009/10/17/work-in-progress-open-doccheck.html",
  "2009/10/pmd-245-installed-in-cdk-12x-branch.html": "2009/10/16/pmd-245-installed-in-cdk-12x-branch.html",
  "2009/10/google-wave-invite-but-you-need-to-work.html": "2009/10/01/google-wave-invite-but-you-need-to-work.html",
  "2009/09/bioclipse-rdf-and-defeasible-reasoning.html": "2009/09/11/bioclipse-rdf-and-defeasible-reasoning.html",
  "2009/09/open-chemical-data-1-nmrshiftdb.html": "2009/09/10/open-chemical-data-1-nmrshiftdb.html",
  "2009/09/nmrshiftdb-rdf-2-some-statistics.html": "2009/09/05/nmrshiftdb-rdf-2-some-statistics.html",
  "2009/09/nmrshiftdb-rdf-1-spectra-by-inchi.html": "2009/09/05/nmrshiftdb-rdf-1-spectra-by-inchi.html",
  "2009/09/nmrshiftdb-enters-rdfopenmoleculesnet-2.html": "2009/09/04/nmrshiftdb-enters-rdfopenmoleculesnet-2.html",
  "2009/09/google-wave-robot-for-cdk-functionality.html": "2009/09/02/google-wave-robot-for-cdk-functionality.html",
  "2009/08/bioclipse-and-sparql-end-points-2.html": "2009/08/21/bioclipse-and-sparql-end-points-2.html",
  "2009/08/social-web-does-not-wait-for-bioclipse.html": "2009/08/17/social-web-does-not-wait-for-bioclipse.html",
  "2009/08/bioclipse-and-sparql-end-points.html": "2009/08/16/bioclipse-and-sparql-end-points.html",
  "2009/08/making-bioclipse-development-easier-new.html": "2009/08/13/making-bioclipse-development-easier-new.html",
  "2009/07/new-blogs-11.html": "2009/07/31/new-blogs-11.html",
  "2009/07/maintaining-jchempaint-primary-patch.html": "2009/07/31/maintaining-jchempaint-primary-patch.html",
  "2009/07/new-blogs-10.html": "2009/07/23/new-blogs-10.html",
  "2009/07/bioclipse-moving-to-github-cia-hooks.html": "2009/07/15/bioclipse-moving-to-github-cia-hooks.html",
  "2009/07/jchempaint-primary-moving-to-git.html": "2009/07/08/jchempaint-primary-moving-to-git.html",
  "2009/06/making-patches-attribution-copyright.html": "2009/06/30/making-patches-attribution-copyright.html",
  "2009/06/michel-dumontier-at-uppsala-university.html": "2009/06/26/michel-dumontier-at-uppsala-university.html",
  "2009/06/dr-whos-of-life-sciences.html": "2009/06/21/dr-whos-of-life-sciences.html",
  "2009/06/bioclipse-jchempaint.html": "2009/06/18/bioclipse-jchempaint.html",
  "2009/05/bioclipse-beta5-really-last-one-now.html": "2009/05/21/bioclipse-beta5-really-last-one-now.html",
  "2009/05/open-data-license-rights-aggregation.html": "2009/05/18/open-data-license-rights-aggregation.html",
  "2009/05/me-is-having-bioclipsexmpprdf-fun.html": "2009/05/07/me-is-having-bioclipsexmpprdf-fun.html",
  "2009/04/my-cdk-workshop-2009-course-material-2.html": "2009/04/22/my-cdk-workshop-2009-course-material-2.html",
  "2009/04/cdk-workshop-2009-2.html": "2009/04/22/cdk-workshop-2009-2.html",
  "2009/04/cdk-workshop-2009-1.html": "2009/04/21/cdk-workshop-2009-1.html",
  "2009/04/my-cdk-workshop-2009-course-material.html": "2009/04/20/my-cdk-workshop-2009-course-material.html",
  "2009/04/open-knowledge-reproducibility-in.html": "2009/04/08/open-knowledge-reproducibility-in.html",
  "2009/03/journal-of-cheminformatics-i-hope.html": "2009/03/22/journal-of-cheminformatics-i-hope.html",
  "2009/03/nature-chemistry-improves-publishing.html": "2009/03/19/nature-chemistry-improves-publishing.html",
  "2009/03/nmrshiftdb-enters-rdfopenmoleculesnet.html": "2009/03/18/nmrshiftdb-enters-rdfopenmoleculesnet.html",
  "2009/03/open-nmr-data-raw-curves-and-annotated.html": "2009/03/04/open-nmr-data-raw-curves-and-annotated.html",
  "2009/02/dbpedia-lookup-and-autocomplete-of.html": "2009/02/dbpedia-lookup-and-autocomplete-of.html",
  "2009/02/solubility-data-in-bioclipse-3-finding.html": "2009/02/27/solubility-data-in-bioclipse-3-finding.html",
  "2009/02/solubility-data-in-bioclipse-2-handling.html": "2009/02/22/solubility-data-in-bioclipse-2-handling.html",
  "2009/02/bioclipse2-scripting-2-searching.html": "2009/02/21/bioclipse2-scripting-2-searching.html",
  "2009/02/dbpedia-enters-rdfopenmoleculesnet.html": "2009/02/17/dbpedia-enters-rdfopenmoleculesnet.html",
  "2009/02/bioclipse-for-cdk-developers-1.html": "2009/02/15/bioclipse-for-cdk-developers-1.html",
  "2009/02/cdk-12-release-candidate.html": "2009/02/10/cdk-12-release-candidate.html",
  "2009/01/details-behind-calling-xmpp-cloud.html": "2009/01/21/details-behind-calling-xmpp-cloud.html",
  "2009/01/rsc-now-allows-jmol-in-main-text-of.html": "2009/01/19/rsc-now-allows-jmol-in-main-text-of.html",
  "2009/01/calling-xmpp-cloud-services-from.html": "2009/01/19/calling-xmpp-cloud-services-from.html",
  "2009/01/bioclipse-and-gist-integration.html": "2009/01/16/bioclipse-and-gist-integration.html",
  "2008/12/editing-and-validation-of-cml-documents.html": "2008/12/30/editing-and-validation-of-cml-documents.html",
  "2008/12/who-says-java-is-not-fast.html": "2008/12/04/who-says-java-is-not-fast.html",
  "2008/11/scripting-jchempaint.html": "2008/11/20/scripting-jchempaint.html",
  "2008/11/solubility-data-in-bioclipse-1.html": "2008/11/18/solubility-data-in-bioclipse-1.html",
  "2008/11/re-open-source-peer-review.html": "2008/11/12/re-open-source-peer-review.html",
  "2008/11/opendatasourcestandards-is-not-enough.html": "2008/11/07/opendatasourcestandards-is-not-enough.html",
  "2008/11/next-generation-asynchronous.html": "2008/11/04/next-generation-asynchronous.html",
  "2008/11/embrace-workshop-in-uppsala.html": "2008/11/03/embrace-workshop-in-uppsala.html",
  "2008/10/next-generation-asynchronous.html": "2008/10/31/next-generation-asynchronous.html",
  "2008/10/bioclipse2-scripting-1-from-smiles-to.html": "2008/10/25/bioclipse2-scripting-1-from-smiles-to.html",
  "2008/10/git-eclipse-integration.html": "2008/10/24/git-eclipse-integration.html",
  "2008/10/gittodo-support-for-freemind-graphical.html": "2008/10/20/gittodo-support-for-freemind-graphical.html",
  "2008/10/jchempaint-history-cml-patches-in-1999.html": "2008/10/02/jchempaint-history-cml-patches-in-1999.html",
  "2008/09/git-mirror-for-cdk.html": "2008/09/30/git-mirror-for-cdk.html",
  "2008/09/moved-to-sweden-post-doc-in-bioclipse.html": "2008/09/24/moved-to-sweden-post-doc-in-bioclipse.html",
  "2008/09/cdk-development-with-branches-using-git.html": "2008/09/07/cdk-development-with-branches-using-git.html",
  "2008/09/ubiquity-fun-entering-semantic-markup.html": "2008/09/01/ubiquity-fun-entering-semantic-markup.html",
  "2008/08/science-blogging-2008-london-was-cool.html": "2008/08/31/science-blogging-2008-london-was-cool.html",
  "2008/08/metware-screenshot-spectrum-support.html": "2008/08/20/metware-screenshot-spectrum-support.html",
  "2008/07/commercial-qsar-modeling-sorry-already.html": "2008/07/23/commercial-qsar-modeling-sorry-already.html",
  "2008/07/peer-reviewed-chemoinformatics-why.html": "2008/07/22/peer-reviewed-chemoinformatics-why.html",
  "2008/06/recovering-full-mass-spectra-from-gc-ms.html": "2008/06/04/recovering-full-mass-spectra-from-gc-ms.html",
  "2008/06/finding-differences-between_03.html": "2008/06/03/finding-differences-between_03.html",
  "2008/06/finding-differences-between.html": "2008/06/01/finding-differences-between.html",
  "2008/05/development-of-new-jchempaint.html": "2008/05/19/development-of-new-jchempaint.html",
  "2008/05/metware-status-report.html": "2008/05/16/metware-status-report.html",
  "2008/05/wicked-chemistry-and-unit-testing.html": "2008/05/03/wicked-chemistry-and-unit-testing.html",
  "2008/04/quality-publishing-endnote-versus.html": "2008/04/22/quality-publishing-endnote-versus.html",
  "2008/04/cdkmetabolomicschemometrics.html": "2008/04/07/cdkmetabolomicschemometrics.html",
  "2008/04/t-plus-18-hours-dr-and-preparing-for.html": "2008/04/03/t-plus-18-hours-dr-and-preparing-for.html",
  "2008/04/t-minus-26-hours-defending-open-source.html": "2008/04/01/t-minus-26-hours-defending-open-source.html",
  "2008/03/cdk-module-dependencies-2.html": "2008/03/23/cdk-module-dependencies-2.html",
  "2008/03/chemical-object-identifier-or-freedom.html": "2008/03/09/chemical-object-identifier-or-freedom.html",
  "2008/03/todo-april-2nd-defend-my-phd-work.html": "2008/03/01/todo-april-2nd-defend-my-phd-work.html",
  "2008/01/be-in-my-advisory-board-2-jchempaint.html": "2008/01/15/be-in-my-advisory-board-2-jchempaint.html",
  "2008/01/cdk-literature-4.html": "2008/01/06/cdk-literature-4.html",
  "2007/12/christmas-presents.html": "2007/12/21/christmas-presents.html",
  "2007/11/be-in-my-advisory-board-1-being-good.html": "2007/11/27/be-in-my-advisory-board-1-being-good.html",
  "2007/11/metware-metabolomics-database-project.html": "2007/11/22/metware-metabolomics-database-project.html",
  "2007/11/molecules-in-wikipedia-without-inchis-3.html": "2007/11/16/molecules-in-wikipedia-without-inchis-3.html",
  "2007/11/evidence-of-aromaticity.html": "2007/11/06/evidence-of-aromaticity.html",
  "2007/10/one-billion-biochemical-rdf-triples.html": "2007/10/24/one-billion-biochemical-rdf-triples.html",
  "2007/10/how-blogosphere-changes-publishing.html": "2007/10/01/how-blogosphere-changes-publishing.html",
  "2007/09/tagging-molecules-mashup-of-connotea.html": "2007/09/19/tagging-molecules-mashup-of-connotea.html",
  "2007/08/operator-08-released-new-sechemtic-user.html": "2007/08/22/operator-08-released-new-sechemtic-user.html",
  "2007/08/centralized-or-decentralized.html": "2007/08/13/centralized-or-decentralized.html",
  "2007/07/rdf-ing-molecular-space.html": "2007/07/31/rdf-ing-molecular-space.html",
  "2007/07/osra-gpl-ed-molecule-drawing-to-smiles.html": "2007/07/20/osra-gpl-ed-molecule-drawing-to-smiles.html",
  "2007/07/cdk-literature-2.html": "2007/07/14/cdk-literature-2.html",
  "2007/07/atom-typing-in-cdk.html": "2007/07/01/atom-typing-in-cdk.html",
  "2007/05/cb-comments-for-inchis.html": "2007/05/05/cb-comments-for-inchis.html",
  "2007/02/rsc-first-publisher-to-go-semantic.html": "2007/02/01/rsc-first-publisher-to-go-semantic.html",
  "2007/01/chemistry-in-html-javascript-from.html": "2007/01/02/chemistry-in-html-javascript-from.html",
  "2006/12/modern-chemistry-in-cdk-beyond-two.html": "2006/12/30/modern-chemistry-in-cdk-beyond-two.html",
  "2006/12/including-smiles-cml-and-inchi-in.html": "2006/12/10/including-smiles-cml-and-inchi-in.html",
  "2006/09/chemical-archeology-oscar3-to.html": "2006/09/08/chemical-archeology-oscar3-to.html",
  "2006/04/mining-kegg-pathway-database-with-self.html": "2006/04/04/mining-kegg-pathway-database-with-self.html",
  "2005/11/when-to-stop-including-qsar-model.html": "2005/11/08/when-to-stop-including-qsar-model.html"
]

oldPref = "http://chem-bla-ics.blogspot.com/"
newPref = "https://chem-bla-ics.linkedchemistry.info/"

dir = new File(".")
dir.eachFileRecurse (FileType.FILES) { file ->
  if (file.extension == "markdown") {
    content = ""
    updated = false
    inHeader = false
    headerDone = false
    modifiedFound = false
    
    file.eachLine { line ->
      if (line.equals("---")) {
        if (inHeader) { // end of header
          inHeader = false
          headerDone = true
          if (!modifiedFound) line = "modified_date: ${date}\n" + line
        } else {
          inHeader = true
        }
      } else if (inHeader) {
        if (line.startsWith("modified_date: ")) {
          line = "modified_date: ${date}"
          modifiedFound = true
        }
      }
      mappings.each { entry ->
        oldContent = "](" + oldPref + entry.key
        newContent = " <i class=\"fa-solid fa-recycle fa-xs\"></i>](" + newPref + entry.value
        if (line.contains(oldContent) && !(line.contains("keep link"))) {
          line = line.replace(oldContent, newContent)
          updated = true
        }
        oldContent = "](" + oldPref.replace("http://","https://") + entry.key
        if (line.contains(oldContent) && !(line.contains("keep link"))) {
          line = line.replace(oldContent, newContent)
          updated = true
        }
      }
      content += line + "\n"
    }
    if (updated) {
      println "Processing ${file}"
      file.text = content
    }
  }
}
