(ns functional.quad)

(defn quad [a b c]
  (cond (and (zero? a) (zero? b))
        []

        (zero? a)
        [(/ (- c) b)]

        :else
        (let [disc (-
                    (* b b)
                    (* 4 a c))]
          [(/
            (+ (- b) (Math/sqrt disc))
            (* 2 a))
           (/
            (- (- b) (Math/sqrt disc))
            (* 2 a))])))