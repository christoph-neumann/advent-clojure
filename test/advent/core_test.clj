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
