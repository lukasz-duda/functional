(ns mastermind.code-maker)

(defn score [code guess]
  [(reduce + (map #(if (= %1 %2) 1 0) code guess))])