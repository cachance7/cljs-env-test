(defproject perfection "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.145"]]
  :jvm-opts ["-Xmx1G"]
  :plugins [[lein-cljsbuild "1.1.0-SNAPSHOT"]]

  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src/perfection"]
                        :compiler {:output-to "resources/public/perfection.js"
                                   :output-dir "resources/public/out"
                                   :optimizations :none
                                   :source-map true}}]})
