(ns clojure.examples.hello
   (:gen-class))
(defn Example []
   (println (* 16 124))
   (println (- 2000 16))
   (println (+ 1 2)))
(Example)

(* 16 124) ; Gives you 1984.
(- 2000 16) ; 1984 again.
(/ 25792 13) ; 1984 yet 
