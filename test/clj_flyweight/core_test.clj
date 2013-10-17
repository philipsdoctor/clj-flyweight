(ns clj-flyweight.core-test
  (:require [clojure.test :refer :all]
            [clj-flyweight.core :refer :all]))

"
Goal: take a dsl and extract a sub-object

{:first {:second [[:third \"third\"] [:fourth \"fourth\"]]}
 :first-b #{:second-b :third-b}
 :first-c [[:second-c] [:third-c]]
 :first-d {:second-d :third-d}}

"

(deftest find-subset-test
  (testing "Finds a single subnode"
    (is (= (get-subset [:first] {:first "one"}) nil))))
