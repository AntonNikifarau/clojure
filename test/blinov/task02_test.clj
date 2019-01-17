(ns blinov.task02-test
  (:require [clojure.test  :refer :all]
            [blinov.task02 :refer :all])
  (:import  [blinov.task02 Complex]))

(deftest test-addition
  (testing
    (is (= (Complex. 3 4) (addition (first complex-numbers) (second complex-numbers))))))

(deftest test-subtraction
  (testing
    (is (= (Complex. -1 -2) (subtraction (first complex-numbers) (second complex-numbers))))))

(deftest test-multiplication
  (testing
    (is (= (Complex. -1 5) (multiplication (first complex-numbers) (second complex-numbers))))))

(deftest test-division
  (testing
    (is (= (Complex. 0 0) (division (first complex-numbers) (second complex-numbers))))))

(deftest test-sum
  (testing
    (is (= (Complex. 3 4) (sum complex-numbers)))))

(deftest test-mult
  (testing
    (is (= (Complex. -1 5) (mult complex-numbers)))))

