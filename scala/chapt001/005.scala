scala> "scala".drop(2)
res0: String = ala

scala> "scala".drop(2).take(2)
res1: String = al

scala> "scala".drop(2).take(2).capitalize
res2: String = Al

scala> val s1 = "Hello"
s1: String = Hello

scala> val s2 = "Hello"
s2: String = Hello

scala> val s3 = "H" + "ello"
s3: String = Hello

scala> s1 == s2
res3: Boolean = true

scala> s1 == s3
res4: Boolean = true

scala> val s4: String = null
s4: String = null

scala> s3 == s4
res5: Boolean = false

scala> s4 == s3
res6: Boolean = false

scala> val s1 = "Hello"
s1: String = Hello

scala> val s2 = "hello"
s2: String = hello

scala> s1.toUpperCase == s2.toUpperCase
res7: Boolean = true

scala> val s1: String = null
s1: String = null

scala> val s2: String = null
s2: String = null

scala> s1.toUpperCase == s2.toUpperCase
java.lang.NullPointerException
  ... 33 elided

scala> val a = "Marisa"
a: String = Marisa

scala> val b = "marisa"
b: String = marisa

scala> a.equalsIgnoreCase(b)
res9: Boolean = true
