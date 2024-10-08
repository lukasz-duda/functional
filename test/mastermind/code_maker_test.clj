(ns mastermind.code-maker-test
  (:require [mastermind.code-maker :refer [score]]
            [midje.sweet :refer [fact facts]]))

(facts "code maker"
       (fact "score guess with no matches"
             (score [0 0 0 0] [1 1 1 1]) => [0])
       (fact "score guesss with one position match"
             (score [0 0 0 0] [0 1 1 1]) => [1])
       (fact "guess with two position matches"
             (score [0 0 0 0] [0 1 1 0]) => [2])
       (fact "guess with many possible matches"
             (score [1 1 1 1] [0 1 1 1]) => [3]
             (score [0 0 0 0] [0 0 0 1]) => [3]
             (score [1 2 3 4] [1 2 3 4]) => [4]))