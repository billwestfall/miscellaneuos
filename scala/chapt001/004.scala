scala> "Hello, world".getClass.getName
res0: String = java.lang.String

scala> val s = "Hello, world"
s: String = Hello, world

scala> s.length
res1: Int = 12

scala> val s = "Hello" + " world"
s: String = Hello world

scala> "hello".foreach(println)
h
e
l
l
o

scala> for (c <- "hello") println(c)
h
e
l
l
o

scala> s.getBytes.foreach(println)
72
101
108
108
111
32
119
111
114
108
100

scala> val result = "hello world".filter(_ != 'l')
result: String = heo word

scala> "scala".drop(2).take(2).capitalize
res5: String = Al

