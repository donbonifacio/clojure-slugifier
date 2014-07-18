(ns clojure-slugifier.core-test
  (:require [clojure.test :refer :all]
            [clojure-slugifier.core :refer :all]))

(testing "handles uncomon chars"
  (is (= "andre-da-conceicao" (slugify "André da Conceição"))))

(testing "dashes for spaces"
  (is (= "pedro-santos" (slugify "pedro santos"))))

(testing "lower cases"
  (is (= "pedro-santos" (slugify "Pedro Santos"))))

