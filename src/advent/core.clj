(ns advent.core
  (:gen-class))

(defn floorinc [floor c] (if (= c \() (inc floor) (dec floor)))

(defn day01
  "Day 01"
  [input]
  (str "floor " (reduce floorinc 0 input)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  )
