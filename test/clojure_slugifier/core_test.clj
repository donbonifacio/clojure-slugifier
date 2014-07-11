(ns clojure-slugifier.core-test
  (:require [clojure.test :refer :all]
            [clojure-slugifier.core :refer :all]))

(deftest basic-slugify
  (testing "basic slugify usage"
    (is (= "pedro" (slugify "pedro")))))

(deftest dashes-for-spaces
  (testing "dashes for spaces"
    (is (= "pedro-santos" (slugify "pedro santos")))))

(deftest undercase
  (testing "makes lowercase"
    (is (= "pedro-santos" (slugify "Pedro Santos")))))

(deftest undercase
  (testing "handles uncomon chars"
    (is (= "andre-da-conceicao" (slugify "André da Conceição")))))
