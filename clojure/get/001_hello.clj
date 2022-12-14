(ns clojure.examples.hello
   (:gen-class))
(defn Example []
   (println (str "Clo" "jure"))
   (println (str "Hello," " " "world" "!"))
   (println  (str 3 " " 2 " " 1 " Blast off!")))
(Example)
