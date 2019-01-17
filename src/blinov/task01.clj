(ns blinov.task01
  (:gen-class))

(defrecord Car [^long id ^String brand ^String model ^int year ^String color ^BigDecimal price])

(def cars
 [(Car. 1 "Skoda" "Rapid" 2018 "black" 999.99M)
  (Car. 2 "Kia" "Rio" 2016 "brown" 999.99M)])

(defn brand-filter [brand cars] (filter #(.equals brand (:brand %)) cars))

(defn brand-year-filter [brand years cars] (filter #(and (.equals brand (:brand %)) (< years (- (.getYear (java.time.LocalDate/now)) (:year %)))) cars))

(defn year-price-filter [year price cars] (filter #(and (== year (:year %)) (< price (:price %))) cars))

