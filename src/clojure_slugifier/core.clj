(ns clojure-slugifier.core
  (use [clojure.string :only (split trim replace lower-case join)]))

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
      clojure.string/lower-case
      decompose
      compact-spaces
      (clojure.string/replace " " "-")
      (clojure.string/replace #"[^a-z-]" "")))
