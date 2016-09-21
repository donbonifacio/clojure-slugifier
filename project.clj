(defproject clojure-slugifier "0.4.2"
  :description "slugifies strings"
  :url "https://github.com/donbonifacio/clojure-slugifier"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :profiles {:1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0-alpha12"]]}}
  :aliases {"all" ["with-profile" "dev:1.5:1.7:1.8:1.9" "test"]})
