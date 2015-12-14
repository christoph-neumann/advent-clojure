(ns advent.core-test
  (:require [clojure.test :refer :all]
            [advent.core :refer :all]))

(deftest day01a-test
  (testing "Day 01, First Puzzle"
    (is (= "floor 0" (day01a "()()")))
    (is (= "floor 0" (day01a "()()")))
    (is (= "floor 3" (day01a "(((")))
    (is (= "floor 3" (day01a "(()(()(")))
    (is (= "floor 3" (day01a "))(((((")))
    (is (= "floor -1" (day01a "())")))
    (is (= "floor -1" (day01a "))(")))
    (is (= "floor -3" (day01a ")))")))
    (is (= "floor -3" (day01a ")())())")))))

(deftest day01b-test
  (testing "Day 01, Second Puzzle"
    (is (= 3 (day01b "())")))
    (is (= 1 (day01b "))(")))
    (is (= 1 (day01b ")))")))
    (is (= 5 (day01b "(()))")))))


(deftest day02a-test
  (testing "Day 02, First Puzzle"
    (is (= 58 (wrapping [2 3 4])))
    (is (= 58 (day02a "3x2x4")))
    (is (= 43 (day02a "1x1x10")))
    (is (= 43 (day02a "10x1x1")))
    (is (= (+ 58 43) (day02a "2x3x4\n10x1x1")))))

(deftest day02b-test
  (testing "Day 02, Second Puzzle"
    (is (= 34 (ribbon [2 3 4])))
    (is (= 14 (ribbon [1 1 10])))
    (is (= 34 (day02b "2x3x4")))
    (is (= 14 (day02b "1x1x10")))
    (is (= (+ 34 14) (day02b "1x1x10\n2x3x4")))))
