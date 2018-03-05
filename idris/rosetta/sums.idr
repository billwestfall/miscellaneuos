-- idris sums.idr

-- *sums> 4 + 5
-- 9 : Integer
-- *sums> 3 + -5
-- -2 : Integer

main : IO()
main = do
  line <- getLine
  print $ sum $ map cast $ words line
