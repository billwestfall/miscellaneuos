module Greet

greet : IO ()
greet = putStrLn "What is your name? "
||| name <- getLine
||| putStrLn ("Hello " ++ name)
