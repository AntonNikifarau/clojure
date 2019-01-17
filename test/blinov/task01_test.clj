(ns blinov.task01-test
  (:require [clojure.test  :refer :all]
            [blinov.task01 :refer :all]))

(deftest test-1
  (testing "brand-filter: Kia"
    (is (= 2 (:id (first (brand-filter "Kia" cars)))))))

(deftest test-2
  (testing "brand-filter: Skoda"
    (is (= 1 (:id (first (brand-filter "Skoda" cars)))))))

(deftest test-3
  (testing "brand-year-filter: Kia 2018"
    (is (= nil (:id (first (brand-year-filter "Kia" 6 cars)))))))

(deftest test-4
  (testing "brand-year-filter: Skoda 2018"
    (is (= 1 (:id (first (brand-year-filter "Skoda" 0 cars)))))))

(deftest test-5
  (testing "year-price-filter: 2016 10M"
    (is (= nil (:id (first (year-price-filter 2016 1000M cars)))))))

(deftest test-6
  (testing "year-price-filter: 2016 100M"
    (is (= 2 (:id (first (year-price-filter 2016 100M cars)))))))

