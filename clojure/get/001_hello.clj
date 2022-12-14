(ns clojure.examples.hello
   (:gen-class))
(defn Example []
   (println (str "Clo" "jure") ; Returns "Clojure".)
   (println (str "Hello," " " "world" "!") ; Returns the string "Hello, world!")
   (println  (str 3 " " 2 " " 1 " Blast off!") ; Fly me to the Moon!        )
(Example)
