# How Mario can add content

## For Mario: Open on local machine

In WSL2 launch visual studio from repository

from mnt/c/
```
cd Github/sdgnets_homepage/
code .
```
Go to src/core.cljs and Jack-in https://calva.io/connect/ using Ctrl-shift-P "Start a Project REPL and Connect".
Use shadow-cljs and build :app

## Repo structure

- /public: images etc.
- /src/app/views: high-level file calling components and arranges it
- /src/app/components:


## Adding content

Outside of markdown (will come for parts of the website maybe), content is added in clojureScript.
Translate html to hiccup
http://html2hiccup.buttercloud.com/

### Work package descriptions

Defined in /src/app/working_packages

### News
