(ns blinov.task03-test
  (:require [clojure.test  :refer :all]
            [blinov.task03 :refer :all]))

(deftest test-dot-product
  (testing
    (is (= 0 (dot-product v1 v2)))))

(deftest test-is-complanare
  (testing
    (is (= true (is-complanare v1 v2)))))

(deftest test-intersection
  (testing
    (is (= true (intersection v1 v2)))))

(deftest test-vector-product
  (testing
    (is (= [1 1 -2] (vector-product v1 v2)))))

(deftest test-mixed-product
  (testing
    (is (= 6 (mixed-product v1 v2 v3)))))

(deftest test-complanare
  (testing
    (is (= false (complanare v1 v2 v3)))))

