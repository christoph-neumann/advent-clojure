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


; Day 03

(defn next-pos
  "Returns Santa's next (x,y) position given the current postion and movement
  direction."
  [x y dir]
  (case dir
    \^ [x (+ y 1)]
    \v [x (+ y -1)]
    \> [(+ x 1) y]
    \< [(+ x -1) y]))

(defn move
  "Applies the next move to the current (x,y) and returns an updated (x,y) and
  position history"
  [[at_x at_y history] next_move]
  (let [[x y :as pos] (next-pos at_x at_y next_move)]
    [x y (conj history pos)]))

(defn coords
  "Produces a stream of coordinates from the directional input."
  [input]
  (nth (reduce move [0 0 [[0 0]]] input) 2))

(defn day03a
  [input]
  (count (distinct (coords input))))

(defn day03b
  [input]
  (-> (concat (coords (take-nth 2 input)) (coords (take-nth 2 (drop 1 input))))
    (distinct)
    (count)))

#_((day03a (slurp "resources/input/day_03.txt"))
   (day03b (slurp "resources/input/day_03.txt")))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  )
