(ns clojure-slugifier.core
  (use [clojure.string :only (split trim replace lower-case join)]))

(defn- spaces-for-dashes
  [raw]
  (replace raw " " "-"))

(defn- lowercase
  [raw]
  (lower-case raw))

(defn- decompose
  [raw]
  (let [normalized (java.text.Normalizer/normalize raw java.text.Normalizer$Form/NFKD)]
    (.replaceAll normalized "\\p{InCombiningDiacriticalMarks}+"  "")))

(defn- compact-spaces
  [raw]
  (join " "
    (split
      (trim raw) #"\s+")))

(defn slugify
  "Slugifies a given string"
  [raw]
  (-> raw
      (lowercase)
      (decompose)
      (compact-spaces)
      (spaces-for-dashes)))
