(ns blinov.task03
  (:gen-class))

(def v1 [1 1 1])
(def v2 [1 -1 0])
(def v3 [1 3 -1])

(def vectors [v1 v2 v3])

(defn dot-product [v1 v2] (apply + (map * v1 v2)))

(defn is-complanare [v1 v2] (= 0 (dot-product v1 v2)))

(defn intersection [v1 v2] true)

(defn vector-product [v1 v2] [(- (* (nth v1 1) (nth v2 2)) (* (nth v1 2) (nth v2 1))) (- (* (nth v1 2) (nth v2 0)) (* (nth v1 0) (nth v2 2))) (- (* (nth v1 0) (nth v2 1)) (* (nth v1 1) (nth v2 0)))])

(defn mixed-product [v1 v2 v3] (dot-product v1 (vector-product v2 v3)))

(defn complanare [v1 v2 v3] (= 0 (mixed-product v1 v2 v3)))

