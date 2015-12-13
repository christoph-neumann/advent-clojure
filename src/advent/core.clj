(ns advent.core
  (:require [clojure.string :as s])
  (:gen-class))


; Day 01

(defn floorinc [floor c] (if (= c \() (inc floor) (dec floor)))

(defn day01
  "Day 01"
  [input]
  (str "floor " (reduce floorinc 0 input)))

(defn day01b
  "Day 01, Second Puzzle"
  [input]
  (->> input
    (reductions floorinc 0)
    (map-indexed vector)
    (filter #(= -1 (nth %1 1)))
    (first)
    (first)))

#_((day01 (slurp "resources/input/day_01.txt"))
   (day01b (slurp "resources/input/day_01.txt")))


; Day 02

(defn surface
  "Day 02"
  [sides]
  (let [[l w h] (sort sides)]
   (+ (* 3 l w) (* 2 w h) (* 2 h l))))

(defn str-to-surface
  [input]
  (->> (s/split input #"x")
    (map #(Integer/parseInt %))
    (surface)))

(defn day02
  [input]
  (->> (s/split input #"\n")
    (map str-to-surface)
    (reduce +)))

#_((day02 (slurp "resources/input/day_02.txt")))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  )
