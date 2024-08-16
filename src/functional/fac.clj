(ns functional.fac)

(defn fac [n] (if (zero? n) 1 (* n (fac (dec n)))))