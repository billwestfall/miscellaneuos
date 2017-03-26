{-
MacBook-Air:idris billw$ idris plus.idr 
     ____    __     _                                          
    /  _/___/ /____(_)____                                     
    / // __  / ___/ / ___/     Version 0.99.1
  _/ // /_/ / /  / (__  )      http://www.idris-lang.org/      
 /___/\__,_/_/  /_/____/       Type :? for help               

Idris is free software with ABSOLUTELY NO WARRANTY.            
For details type :warranty.
Type checking ./plus.idr
plus.idr:4:6:
When checking right hand side of Main.plus with expected type
        Nat

Can't disambiguate name: Main.plus, Prelude.Nat.plus
plus.idr:9:6:
When checking right hand side of Main.mult with expected type
        Nat

Can't disambiguate name: Main.plus, Prelude.Nat.plus
Holes: Main.mult, Main.plus
*plus> plus (S (S Z)) (S (S Z))
4 : Nat
Holes: Main.mult, Main.plus
*plus> mult (S (S (S Z))) (plus (S (S Z)) (S (S Z)))
12 : Nat
Holes: Main.mult, Main.plus
*plus> (S (S (S (S Z))))
4 : Nat
Holes: Main.mult, Main.plus
*plus> plus 2 2
4 : Nat
Holes: Main.mult, Main.plus
*plus> mult 3 (plus 2 2)
12 : Nat
Holes: Main.mult, Main.plus
*plus> 
-}

-- Unary addition
plus : Nat -> Nat -> Nat
plus Z     y = y
plus (S k) y = S (plus k y)

-- Unary multiplication
mult : Nat -> Nat -> Nat
mult Z     y = Z
mult (S k) y = plus y (mult k y)
