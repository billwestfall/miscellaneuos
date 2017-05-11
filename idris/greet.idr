module Greet

greet : IO ()
greet = putStr "What is your name? "
||| name <- getLine
||| putStrLn ("Hello " ++ name)
