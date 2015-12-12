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
