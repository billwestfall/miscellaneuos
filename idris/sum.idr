mkSingle : (x : Bool) -> isSingleton x
mkSingle True = 0
mkSingle False = []
sum : (single : Bool) -> isSingleton single -> Nat
sum True x = x
sum False [] = 0
sum False (x :: xs) = x + sum False xs
