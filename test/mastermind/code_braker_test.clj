(ns mastermind.code-braker-test
  (:require [midje.sweet :refer [facts fact]]
            [mastermind.code-braker :refer [break-code]]))

(facts "code braker"
       (fact "initial guess"
             (break-code []) => [0 0 0 0]))