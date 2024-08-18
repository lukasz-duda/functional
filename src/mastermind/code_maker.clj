(ns mastermind.code-maker)

(defn- position-matches [code guess]
  (reduce + (map #(if (= %1 %2) 1 0) code guess)))

(defn score [code guess]
  [(position-matches code guess)])