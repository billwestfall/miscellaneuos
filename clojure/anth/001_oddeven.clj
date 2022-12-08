(ns clojure.examples.odda
   (:gen-class))
(defn odda []
   print (filter odd? [0 1 2 3])
(odda)
(ns clojure.examples.evena
   (:gen-class))
(defn evena []
   print (filter even? [0 1 2 3])
(evena)
