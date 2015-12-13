(ns advent.core-test
  (:require [clojure.test :refer :all]
            [advent.core :refer :all]))

(deftest day01-test
  (testing "Day 01"
    (is (= "floor 0" (day01 "()()")))
    (is (= "floor 0" (day01 "()()")))
    (is (= "floor 3" (day01 "(((")))
    (is (= "floor 3" (day01 "(()(()(")))
    (is (= "floor 3" (day01 "))(((((")))
    (is (= "floor -1" (day01 "())")))
    (is (= "floor -1" (day01 "))(")))
    (is (= "floor -3" (day01 ")))")))
    (is (= "floor -3" (day01 ")())())")))))

(deftest day01b-test
  (testing "Day 01, Second Puzzle"
    (is (= 3 (day01b "())")))
    (is (= 1 (day01b "))(")))
    (is (= 1 (day01b ")))")))
    (is (= 5 (day01b "(()))")))))


(deftest day02-test
  (testing "Day 02"
    (is (= 58 (surface [2 3 4])))
    (is (= 58 (surface [4 2 3])))
    (is (= 43 (str-to-surface "1x1x10")))
    (is (= 43 (str-to-surface "10x1x1")))
    (is (= (+ 58 43) (day02 "2x3x4\n10x1x1")))))
