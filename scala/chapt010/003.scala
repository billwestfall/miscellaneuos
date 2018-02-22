scala> var sisters = Vector("Melinda")
sisters: scala.collection.immutable.Vector[String] = Vector(Melinda)

scala> sisters = sisters :+ "Melissa"
sisters: scala.collection.immutable.Vector[String] = Vector(Melinda, Melissa)

scala> sisters = sisters :+ "Marisa"
sisters: scala.collection.immutable.Vector[String] = Vector(Melinda, Melissa, Marisa)

scala> sisters.foreach(println)
Melinda
Melissa
Marisa

scala> sisters(0) = "Molly"
<console>:12: error: value update is not a member of scala.collection.immutable.Vector[String]
       sisters(0) = "Molly"
       ^

scala> val v = Vector("a", "b", "c")
v: scala.collection.immutable.Vector[String] = Vector(a, b, c)

scala> v(0)
res2: String = a

scala> val a = Vector(1, 2, 3)
a: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)

scala> val b = a ++ Vector(4, 5)
b: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 5)

scala> val c = b.updated(0, "x")
c: scala.collection.immutable.Vector[Any] = Vector(x, 2, 3, 4, 5)

scala> val a = Vector(1, 2, 3, 4, 5)
a: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 5)

scala> val b = a.take(2)
b: scala.collection.immutable.Vector[Int] = Vector(1, 2)

scala> val c = a.filter(_ > 2)
c: scala.collection.immutable.Vector[Int] = Vector(3, 4, 5)

scala> val c = a.filter(_ < 3)
c: scala.collection.immutable.Vector[Int] = Vector(1, 2)

scala> var a = Vector(1, 2, 3)
a: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)

scala> a = a ++ Vector(4, 5)
a: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 5)

scala> val x = IndexedSeq(1,2,3)
x: IndexedSeq[Int] = Vector(1, 2, 3)

scala> 
