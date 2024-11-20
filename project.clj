(defproject lein-checkall "0.1.1"
  :description "lein check && lein kibit && lein eastwood && lein bikeshed"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [lein-kibit "0.1.11"]
                 [jonase/eastwood "1.4.3"]
                 [lein-bikeshed "0.5.2"]]
  :eval-in-leiningen true)
