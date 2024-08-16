(ns functional.quad-test
  (:require [midje.sweet :refer [facts fact]]
            [functional.quad :refer [quad]]))

(facts "about quad"
       (fact "degenerate"
             (quad 0 0 1) => [])
       (fact "linear "
             (quad 0 1 1) => [-1])
       (fact "simple"
             (quad 1 0 -1) => [1.0 -1.0]))