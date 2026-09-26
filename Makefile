updateReferences: node_modules
	node updateReferences.js

node_modules: package.json
	npm install
	touch node_modules

.PHONY: updateReferences
