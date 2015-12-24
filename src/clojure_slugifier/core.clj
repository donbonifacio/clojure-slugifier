(ns clojure-slugifier.core)

(defn- decompose
  [raw]
  (let [normalized (java.text.Normalizer/normalize raw java.text.Normalizer$Form/NFKD)]
    (.replaceAll normalized "\\p{InCombiningDiacriticalMarks}+"  "")))

(defn slugify
  "Slugifies a given string"
  [raw]
  (-> raw
      clojure.string/lower-case
      decompose
      (clojure.string/replace #"\.|,|;|:|'|\"" "")
      (clojure.string/replace " " "-")))

