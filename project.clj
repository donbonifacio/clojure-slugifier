(defproject clojure-slugifier "0.1.0-SNAPSHOT"
  :description "slugifies strings"
  :url "https://github.com/donbonifacio/clojure-slugifier"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profile {:dev {:dependencies [[expectations "1.4.52"]]}}
  :plugins [[lein-autoexpect "1.0"]]
  :dependencies [
                 [org.clojure/clojure "1.5.1"]
                 [expectations "2.0.6"]])
