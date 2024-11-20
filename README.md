# lein-checkall

All credit to the original developer - see itang/lein-checkall. Unmaintained for 11 years and no longer functional, so just bumping deps and crossing fingers.

A Leiningen plugin to do many wonderful things.

"lein check && lein kibit && lein eastwood && lein bikeshed"

## Usage

Use this for user-level plugins:

Put `[lein-checkall "0.1.1"]` into the `:plugins` vector of your
`:user` profile, or if you are on Leiningen 1.x do `lein plugin install
lein-checkall 0.1.1`.

Use this for project-level plugins:

Put `[lein-checkall "0.1.1"]` into the `:plugins` vector of your project.clj.

and add an example usage that actually makes sense:

    $ lein checkall

## License

Copyright © 2013 itang

Distributed under the Eclipse Public License, the same as Clojure.
