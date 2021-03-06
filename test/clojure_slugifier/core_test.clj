(ns clojure-slugifier.core-test
  (:require [clojure.test :refer :all]
            [clojure-slugifier.core :refer :all]))

(deftest slugifier
  (testing "handles uncomon chars"
    (is (= "andre-da-conceicao" (slugify "André da Conceição"))))

  (testing "dashes for spaces"
    (is (= "pedro-santos" (slugify "pedro santos"))))

  (testing "strip quotes and ponctuation"
    (is (= "pedro-santos" (slugify "pe;d:ro s.a,n\"to's"))))

  (testing "lower cases"
    (is (= "pedro-santos" (slugify "Pedro Santos"))))

  (testing "multiple spaces"
    (is (= "pedro-santos" (slugify "Pedro   Santos"))))

  (testing "multiple spaces at the beginning"
    (is (= "pedro-santos" (slugify "  Pedro Santos"))))

  (testing "multiple spaces at the end"
    (is (= "pedro-santos" (slugify "Pedro Santos  "))))

  (testing "multiple spaces in the middle"
    (is (= "pedro-santos" (slugify "Pedro     Santos"))))

  (testing "multiple fucking spaces"
    (is (= "pedro-santos" (slugify "  Pedro     Santos   ")))))
