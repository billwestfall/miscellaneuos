scala> Array.range(1, 5)
res0: Array[Int] = Array(1, 2, 3, 4)

scala> List.range(0, 10)
res1: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> Vector.range(0, 10, 2)
res2: scala.collection.immutable.Vector[Int] = Vector(0, 2, 4, 6, 8)

scala> val a = (0 until 10).toArray
a: Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> val list = 1 to 10 by 2 toList
warning: there was one feature warning; re-run with -feature for details
list: List[Int] = List(1, 3, 5, 7, 9)

scala> val set = Set.range(0, 5)
<console>:10: error: value range is not a member of object scala.collection.immutable.Set
       val set = Set.range(0, 5)
                     ^

scala> val set = (0 until 10 by 2).toSet
set: scala.collection.immutable.Set[Int] = Set(0, 6, 2, 8, 4)

scala> val letters = ('a' to 'f').toList
letters: List[Char] = List(a, b, c, d, e, f)

scala> val letters = ('a' to 'f').by(2).toList
letters: List[Char] = List(a, c, e)

scala> for (i <- 1 until 10 by 2) println(i)
1
3
5
7
9

scala> val map = (1 to 5).map(_ * 2.0)
map: scala.collection.immutable.IndexedSeq[Double] = Vector(2.0, 4.0, 6.0, 8.0, 10.0)

scala> val map = (1 to 5).map(e => (e,e))
map: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (2,2), (3,3), (4,4), (5,5))

scala> val map = (1 to 5).map(e => (e,e)).toMap
map: scala.collection.immutable.Map[Int,Int] = Map(5 -> 5, 1 -> 1, 2 -> 2, 3 -> 3, 4 -> 4)

scala> package com.acme.app {
<console>:1: error: illegal start of definition
package com.acme.app {
^

scala> object Margin extends Enumeration {
     | type Margin = Value
     | val TOP, BOTTOM, LEFT, RIGHT = Value }
defined object Margin

scala> }val d = ("Debi", 95)
<console>:1: error: eof expected but '}' found.
}val d = ("Debi", 95)
^

scala> val d = ("Debi", 95)
d: (String, Int) = (Debi,95)

scala> case class Person(name: String)
defined class Person

scala> val t = (3, "Three", new Person("Al"))
t: (Int, String, Person) = (3,Three,Person(Al))

scala> t._1
res4: Int = 3

scala> t._2
res5: String = Three

scala> t._3
res6: Person = Person(Al)

scala> val(x, y, z) = (3, "Three", new Person("Al"))
x: Int = 3
y: String = Three
z: Person = Person(Al)

scala> val (x, y, _) = t
x: Int = 3
y: String = Three

scala> val (x, _, _) = t
x: Int = 3

scala> val (x, _, z) = t
x: Int = 3
z: Person = Person(Al)

scala> val a = ("AL", "Alabama")
a: (String, String) = (AL,Alabama)

scala> val b = "AL" -> "Alabama"
b: (String, String) = (AL,Alabama)

scala> val c = ("AL" -> "Alabama")
c: (String, String) = (AL,Alabama)

scala> c.getClass
res7: Class[_ <: (String, String)] = class scala.Tuple2

scala> val x = ("AL" -> "Alabama")
x: (String, String) = (AL,Alabama)

scala> val it = x.productIterator
it: Iterator[Any] = non-empty iterator

scala> for (e <- it) println(e)
AL
Alabama

scala> for (e <- it) println(e)

scala> val t = ("AL", "Alabama")
t: (String, String) = (AL,Alabama)

scala> t.productIterator.toArray
res10: Array[Any] = Array(AL, Alabama)

scala> 
