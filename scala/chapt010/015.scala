scala> val x = Vector(1, 1, 2, 3, 3, 4)
x: scala.collection.immutable.Vector[Int] = Vector(1, 1, 2, 3, 3, 4)

scala> val y = x.distinct
y: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4)

scala> val s = x.toSet
s: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)

scala> s
res0: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)

scala> val dale1 = new Person("Dale", "Cooper")
<console>:10: error: not found: type Person
       val dale1 = new Person("Dale", "Cooper")
                       ^

scala> val a = collection.mutable.ArrayBuffer(1,2,3)
a: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)

scala> a ++= Seq(4,5,6)
res1: a.type = ArrayBuffer(1, 2, 3, 4, 5, 6)

scala> val a = Array(1,2,3)
a: Array[Int] = Array(1, 2, 3)

scala> val b = Array(4,5,6)
b: Array[Int] = Array(4, 5, 6)

scala> val c = a ++ b
c: Array[Int] = Array(1, 2, 3, 4, 5, 6)

scala> val d = Array(f,g,h)
<console>:10: error: not found: value f
       val d = Array(f,g,h)
                     ^
<console>:10: error: not found: value g
       val d = Array(f,g,h)
                       ^
<console>:10: error: not found: value h
       val d = Array(f,g,h)
                         ^

scala> val a = Array(1,2,3,4,5)
a: Array[Int] = Array(1, 2, 3, 4, 5)

scala> val b = Array(4,5,6,7,8)
b: Array[Int] = Array(4, 5, 6, 7, 8)

scala> val c = a.intersect(b)
c: Array[Int] = Array(4, 5)

scala> val c = a.union(b)
c: Array[Int] = Array(1, 2, 3, 4, 5, 4, 5, 6, 7, 8)

scala> val c = a.union(b).distinct
c: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8)

scala> val c = a diff b
c: Array[Int] = Array(1, 2, 3)

scala> val c = b diff a
c: Array[Int] = Array(6, 7, 8)

scala> Array.concat(a, b)
res2: Array[Int] = Array(1, 2, 3, 4, 5, 4, 5, 6, 7, 8)

scala> val a = List(1,2,3,4)
a: List[Int] = List(1, 2, 3, 4)

scala> val b = List(4,5,6,7)
b: List[Int] = List(4, 5, 6, 7)

scala> val c = a ::: b
c: List[Int] = List(1, 2, 3, 4, 4, 5, 6, 7)

scala> val a = Array(1,2,3,11,4,12,4,5)
a: Array[Int] = Array(1, 2, 3, 11, 4, 12, 4, 5)

scala> val b = Array(6,7,4,5)
b: Array[Int] = Array(6, 7, 4, 5)

scala> val c = a.toSet diff b.toSet
c: scala.collection.immutable.Set[Int] = Set(1, 2, 12, 3, 11)

scala> val d = b.toSet diff a.toSet
d: scala.collection.immutable.Set[Int] = Set(6, 7)

scala> val complement = c ++ d
complement: scala.collection.immutable.Set[Int] = Set(1, 6, 2, 12, 7, 3, 11)

scala> val c = a.toSet -- b.toSet
c: scala.collection.immutable.Set[Int] = Set(1, 2, 12, 3, 11)

scala> val d = b.toSet -- a.toSet
d: scala.collection.immutable.Set[Int] = Set(6, 7)

scala> val i = a.intersect(b)
i: Array[Int] = Array(4, 5)

scala> val c = a.toSet -- i.toSet
c: scala.collection.immutable.Set[Int] = Set(1, 2, 12, 3, 11)

scala> val d = b.toSet -- i.toSet
d: scala.collection.immutable.Set[Int] = Set(6, 7)

scala> 
