(ns clojure-slugifier.core)

(defn- spaces-for-dashes
  [raw]
  (clojure.string/replace raw " " "-"))

(defn- lowercase
  [raw]
  (clojure.string/lower-case raw))

(defn- slugifier
  []
  (comp spaces-for-dashes
        lowercase))

(defn slugify
  "Slugifies a given string"
  [raw]
  ((slugifier) raw))

