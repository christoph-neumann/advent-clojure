(ns advent.core
  (:require [clojure.string :as s])
  (:gen-class))


; Day 01

(defn floorinc [floor c] (if (= c \() (inc floor) (dec floor)))

(defn day01a
  [input]
  (str "floor " (reduce floorinc 0 input)))

(defn day01b
  [input]
  (->> input
    (reductions floorinc 0)
    (map-indexed vector)
    (filter #(= -1 (nth %1 1)))
    (first)
    (first)))

#_((day01a (slurp "resources/input/day_01.txt"))
   (day01b (slurp "resources/input/day_01.txt")))


; Day 02

(defn parse-row
  [row]
  (sort (map #(Integer/parseInt %) (s/split row #"x"))))

(defn parse
  [input]
  (map parse-row (s/split input #"\n")))

;; Determines the amount of wrapping paper the elves need. Assumes the sizes
;; have been pre-sorted by size.
(defn wrapping
  [[l w h]]
  (+ (* 3 l w) (* 2 w h) (* 2 h l)))

;; Determines the amount of ribbon the elves need. Assumes the sizes have been
;; pre-sorted by size.
(defn ribbon
  [[l w h]]
  (+ l l w w (* l w h)))

(defn day02-solve
  [input op]
  (->> (parse input)
    (map op)
    (reduce +)))

(defn day02a [input] (day02-solve input wrapping))
(defn day02b [input] (day02-solve input ribbon))

#_((day02a (slurp "resources/input/day_02.txt"))
   (day02b (slurp "resources/input/day_02.txt")))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  )
