(defproject perfection "0.1.0-SNAPSHOT"
  :description "Test project for clojurescript development environment"
  :url "http://cljs-test.caseychance.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.145"]]
  :jvm-opts ["-Xmx1G"]
  :plugins [[lein-cljsbuild "1.1.0-SNAPSHOT"]
            [lein-figwheel "0.4.1"]
            [lein-doo "0.1.4"]]

  :figwheel {:http-server-root "public"
             :port 3449
             :css-dirs ["resources/public/css"]}

  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src/perfection" "src/figwheel"]
                        :compiler {:output-to "resources/public/perfection.js"
                                   :output-dir "resources/public/out"
                                   :optimizations :none
                                   :source-map true}}]})
