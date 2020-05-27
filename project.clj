(defproject mumble-clj "0.0.1"
  :description "Mumble Kata"
  :dependencies [
                 [org.clojure/clojure "1.9.0"]
                 ]
  :source-paths ["src"]
  :target-path "target/%s"
  :aot :all
  :plugins [[lein-auto "0.1.3"]])