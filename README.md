# clj-flyweight

The flyweight pattern is a pattern where multiple objects share most or part of their data with a single object, thus minimizing the memory size of all of the objects <http://en.wikipedia.org/wiki/Flyweight_pattern> .  This pattern is well suited to clojure as we are already using immutable objects, further clojure lends itself to creating and using DSLs, many of which actually contain collections of sub objects.  This library is intended to make composing and extracting data from these objects much less painful.


## Usage

... TODO

    {:first {:second [[:third \"third\"] [:fourth \"fourth\"]]}
     :first-b #{:second-b :third-b}
     :first-c [[:second-c] [:third-c]]
     :first-d {:second-d :third-d}}


## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
