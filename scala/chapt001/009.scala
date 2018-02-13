scala> val upper = "hello, world".map(c => c.toUpper)
upper: String = HELLO, WORLD

scala> val upper = "hello, world".map(_.toUpper)
upper: String = HELLO, WORLD

scala> val upper = "hello, world".filter(_ != 'l').map(_.toUpper)
upper: String = HEO, WORD

scala> val upper = "hello, world".filter(_ != 'r').map(_.toUpper)
upper: String = HELLO, WOLD

scala> val upper = "hello, world".filter(_ != 'o').map(_.toUpper)
upper: String = HELL, WRLD

scala> for (c <- "hello") println(c)
h
e
l
l
o

scala> val upper = for (c <- "hello, world") yield c.toUpper
upper: String = HELLO, WORLD

scala> "hello".foreach(println)
h
e
l
l
o

scala> def toLower(c: Char): Char = (c.toByte+32).toChar
toLower: (c: Char)Char

scala> "HELLO".map(toLower)
res2: String = hello

scala> val s = "HELLO"
s: String = HELLO

scala> for (c <- s) yield toLower(c)
res3: String = hello

scala> val toLower = (c: Char) => (c.toByte+32).toChar
toLower: Char => Char = <function1>

scala> "HELLO".map(toLower)
res4: String = hello

scala> "hello".getBytes
res5: Array[Byte] = Array(104, 101, 108, 108, 111)

scala> "hello".getBytes.foreach(println)
104
101
108
108
111
