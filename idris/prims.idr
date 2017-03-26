{-
MacBook-Air:idris billw$ idris prims.idr 
     ____    __     _                                          
    /  _/___/ /____(_)____                                     
    / // __  / ___/ / ___/     Version 0.99.1
  _/ // /_/ / /  / (__  )      http://www.idris-lang.org/      
 /___/\__,_/_/  /_/____/       Type :? for help               

Idris is free software with ABSOLUTELY NO WARRANTY.            
For details type :warranty.
Type checking ./prims.idr
*prims> 6*6+6
42 : Integer
*prims> 6*6+5
41 : Integer
*prims> x == 6*6+6
True : Bool
*prims> if x == 6 * 6 + 6 then "the answer" else "fail whale"
"the answer" : String
*prims> if y == 6 * 6 + 6 then "the answer" else "fail whale"
When checking an application of function Prelude.Interfaces.==:
        No such variable y
*prims> if y == b then "the answer" else "fail whale"
When checking an application of function Prelude.Interfaces.==:
        No such variable y
*prims> if x == b then "the answer" else "fail whale"
When checking an application of function Prelude.Interfaces.==:
        No such variable b
*prims> if x == 0.5 then "the answer" else "fail whale"
(input):1:6-8:When checking an application of function Prelude.Interfaces.==:
        Type mismatch between
                Double (Type of 0.5)
        and
                Int (Expected type)
-}                

module Prims

x : Int
x = 42

foo : String
foo = "Sausage machine"

bar : Char
bar = 'Z'

quux : Bool
quux = False
