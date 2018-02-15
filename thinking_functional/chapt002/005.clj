(defn classify [num]
(let [factors (->> (range 1 (inc num)) ;
(filter#(zero?(remnum%)))) ; sum (reduce + factors) ; aliquot-sum (- sum num)] ;
(cond ; (= aliquot-sum num) :perfect
(> aliquot-sum num) :abundant
(< aliquot-sum num) :deficient)))
