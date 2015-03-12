(ns clojure-slugifier.core)

(defn- spaces-for-dashes
  [raw]
  (clojure.string/replace raw " " "-"))

(defn- lowercase
  [raw]
  (clojure.string/lower-case raw))

(defn- decompose
  [raw]
  (let [normalized (java.text.Normalizer/normalize raw java.text.Normalizer$Form/NFKD)]
    (.replaceAll normalized "\\p{InCombiningDiacriticalMarks}+"  "")))

(defn slugify
  "Slugifies a given string"
  [raw]
  (-> raw
      (lowercase)
      (decompose)
      (spaces-for-dashes)))

