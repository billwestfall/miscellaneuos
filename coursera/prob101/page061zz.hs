{-
for Coursera probability course, taken from
https://www.fpcomplete.com/school/starting-with-haskell/libraries-and-frameworks/randoms
*Main> :l page061zz.hs
[1 of 1] Compiling Main             ( page061z.hs, interpreted )
Ok, modules loaded: Main.
*Main> main
"10011101010100100101000000011101110001101101010011"
*Main> main
"10101000000101010011100101101001011101100101001010"
-}

import System.Random

main = do
  g <- newStdGen
  print $ take 50 (randomRs ('0', '1') g)
