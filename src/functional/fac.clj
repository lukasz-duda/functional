(ns functional.fac)

(defn fac-it [f n] (if (zero? n) f (recur (* n f) (dec n))))

(defn fac [n] (fac-it 1 n))