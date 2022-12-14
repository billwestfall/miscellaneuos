(ns clojure.examples.odda
   (:gen-class))
(defn odda []
   println (filter odd? [0 1 2 3]))
(odda)
