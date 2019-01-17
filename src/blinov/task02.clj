(ns blinov.task02
  (:gen-class))

(defrecord Complex [^long r ^long i])

(def complex-numbers
 [(Complex. 1 1)
  (Complex. 2 3)])

(defn addition [^Complex a ^Complex b] (Complex. (+ (:r a) (:r b)) (+ (:i a) (:i b))))

(defn subtraction [^Complex a ^Complex b] (Complex. (- (:r a) (:r b)) (- (:i a) (:i b))))

(defn multiplication [^Complex a ^Complex b]
  (let [x (:r a)
        y (:i a)
        u (:r b)
        v (:i b)]
    (Complex. (- (* x u) (* y v)) (+ (* x v) (* y u)))))

(defn division [^Complex x ^Complex y]
  (let [a (:r x)
        b (:i x)
        c (:r y)
        d (:i y)]
    (Complex. (/ (+ (* a c) (* b d)) (+ (* c c) (* d d))) (/ (- (* b c) (* a d)) (+ (* c c) (* d d))))))

(defn sum [complex-nums] (reduce addition complex-nums))

(defn mult [complex-nums] (reduce multiplication complex-nums))

