(ns clj-flyweight.core-test
  (:require [clojure.test :refer :all]
            [clj-flyweight.core :refer :all]))

(deftest find-subset-test
  (testing "Finds a single subnode"
    (is (= (get-subset [:first] {:first "one"}) nil))))
