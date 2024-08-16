(ns functional.sqrt-test
  (:require [clojure.test :refer [deftest is testing]]
            [functional.sqrt :refer [sqrt square]]))

(deftest square-test
  (testing "integers"
    (is (= 4 (square 2)))
    (is (= 9 (square 3)))))

(defn close? [x y]
  (< (abs (double (- x y))) 0.001))

(deftest sqrt-test
  (testing "integers"
    (is (close? 2 (sqrt 4)))
    (is (close? 3 (sqrt 9)))))