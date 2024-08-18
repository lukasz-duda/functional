(ns mastermind.code-maker-test
  (:require [mastermind.code-maker :refer [score]]
            [midje.sweet :refer [fact facts]]))

(facts "code maker"
       (fact "score guess with no matches"
             (score [0 0 0 0] [1 1 1 1]) => [])
       (fact "score guesss with one position match"
             (score [0 0 0 0] [0 1 1 1]) => [:pos])
       (fact "guess with two position matches"
             (score [0 0 0 0] [0 1 1 0]) => [:pos :pos]))