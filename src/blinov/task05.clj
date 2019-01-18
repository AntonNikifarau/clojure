(ns blinov.task05
  (:gen-class))

(def room-config {:toysMaxCount 8 :toysMaxTotalPrice 1000})

(def toy-config
  {:toy-colors ["black" "red" "blue" "green" "white" "orange" "yellow"]
   :toy-sizes  ["small" "middle" "large"]
   :toy-types  ["car" "doll" "ball" "cube"]
   :toy-max-price 100})

(defn rand-toy [config]
  {:color (rand-nth (:toy-colors config))
   :size  (rand-nth (:toy-sizes config))
   :type  (rand-nth (:toy-types config))
   :price (rand-int (:toy-max-price config))})

(defn fill-room [toy-config room-config]
  (loop [count 0
         price 0
         room []]
    (when (and (< count (:toysMaxCount room-config)) (< price (:toysMaxTotalPrice room-config)))
      (println room)
      (let [toy (rand-toy toy-config)] 
      (recur (inc count) (+ price (:price toy)) (conj room toy))))))

