# override if the system npm does not work, e.g. make updateReferences NPM="node ~/opt/npm10/bin/npm-cli.js"
NPM ?= npm
GROOVY ?= groovy

updateReferences: node_modules
	node updateReferences.js

node_modules: package.json
	$(NPM) install
	touch node_modules

# creates the missing tag/, work/, and molecule/ pages for the tags used in the posts
findTags:
	$(GROOVY) findTags.groovy

.PHONY: updateReferences findTags
