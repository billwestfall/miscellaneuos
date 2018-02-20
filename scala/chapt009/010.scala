scala> val divide: PartialFunction[Int, Int] = { case d: Int if d != 0 => 42 / d 
     | }
divide: PartialFunction[Int,Int] = <function1>

scala> List(0,1,2) map { divide }
scala.MatchError: 0 (of class java.lang.Integer)
  at scala.PartialFunction$$anon$1.apply(PartialFunction.scala:253)
  at scala.PartialFunction$$anon$1.apply(PartialFunction.scala:251)
  at $anonfun$1.applyOrElse(<console>:10)
  at $anonfun$1.applyOrElse(<console>:10)
  at scala.runtime.AbstractPartialFunction$mcII$sp.apply$mcII$sp(AbstractPartialFunction.scala:36)
  at scala.runtime.AbstractPartialFunction$mcII$sp.apply(AbstractPartialFunction.scala:36)
  at scala.runtime.AbstractPartialFunction$mcII$sp.apply(AbstractPartialFunction.scala:28)
  at scala.collection.immutable.List.map(List.scala:273)
  ... 33 elided

scala> List(0,1,2) collect { divide }
res1: List[Int] = List(42, 21)

scala> List(0,1,2,3) collect { divide }
res2: List[Int] = List(42, 21, 14)

scala> List(42, "cat") collect { case i: Int => i + 1 }
res3: List[Int] = List(43)

scala> val sample = 1 to 5
sample: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5)

scala> val isEven: PartialFunction[Int, String] = { case x if x % 2 == 0 => x + " is even" }
isEven: PartialFunction[Int,String] = <function1>

scala> val evenNumbers = sample collect isEven
evenNumbers: scala.collection.immutable.IndexedSeq[String] = Vector(2 is even, 4 is even)

scala> val sample = 1 to 10
sample: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> val evenNumbers = sample collect isEven
evenNumbers: scala.collection.immutable.IndexedSeq[String] = Vector(2 is even, 4 is even, 6 is even, 8 is even, 10 is even)

scala> val isOdd: PartialFunction[Int, String] = { case x if x % 2 == 1 => x + " is odd" }
isOdd: PartialFunction[Int,String] = <function1>

scala> val numbers = sample map (isEven orElse isOdd)
numbers: scala.collection.immutable.IndexedSeq[String] = Vector(1 is odd, 2 is even, 3 is odd, 4 is even, 5 is odd, 6 is even, 7 is odd, 8 is even, 9 is odd, 10 is even)

scala> 
