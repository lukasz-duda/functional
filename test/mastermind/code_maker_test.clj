(ns mastermind.code-maker-test
  (:require [mastermind.code-maker :refer [score]]
            [midje.sweet :refer [fact facts]]))

(facts "code maker"
       (fact "score guess with no matches"
             (score [0 0 0 0] [1 1 1 1]) => []))