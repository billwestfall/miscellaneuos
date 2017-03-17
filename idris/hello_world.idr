||| run as idris hello_world.idr --check -o hello && ./hello

module Main

main : IO ()
main = putStrLn "Hello, World!"
