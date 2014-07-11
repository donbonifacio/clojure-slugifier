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

(defn- slugifier
  []
  (comp spaces-for-dashes
        decompose
        lowercase))

(defn slugify
  "Slugifies a given string"
  [raw]
  ((slugifier) raw))

