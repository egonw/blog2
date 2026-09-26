# override if the system npm does not work, e.g. make updateReferences NPM="node ~/opt/npm10/bin/npm-cli.js"
NPM ?= npm

updateReferences: node_modules
	node updateReferences.js

node_modules: package.json
	$(NPM) install
	touch node_modules

.PHONY: updateReferences
