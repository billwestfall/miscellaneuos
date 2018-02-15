scala> def indexOfAny(input : String, searchChars : Seq[Char]) : Seq[Int] = {
     | def indexedInput = (0 until input.length).zip(input)
     | for (pair <- indexedInput;
     | char <- searchChars;
     | if (char == pair._2)) yield (pair._1)
     | }
indexOfAny: (input: String, searchChars: Seq[Char])Seq[Int]

scala> indexOfAny("zzabyycdxx", "by")
res1: Seq[Int] = Vector(3, 4, 5)

scala> indexOfAny("sfhsiugbadsgavbjkfhsdjlfkha", "a")
res2: Seq[Int] = Vector(8, 12, 26)
