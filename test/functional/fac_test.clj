(ns functional.fac-test
  (:require [midje.sweet :refer [facts fact]]
            [functional.fac :refer [fac]]))

(facts "about factorial"
       (fact "factorial of 1 equals 1"
             (fac 1) => 1)
       (fact "factorial of 2 equals 2"
             (fac 2) => 2)
       (fact "factorial of 3 equals 6"
             (fac 3) => 6)
       (fact "factorial of 10 equals 3628800"
             (fac 10) => 3628800))