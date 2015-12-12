(ns advent.core
  (:gen-class))

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

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  )
