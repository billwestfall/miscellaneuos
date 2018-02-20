scala> val divide = (x: Int) => 42 / x
divide: Int => Int = <function1>

scala> divide(1)
res0: Int = 42

scala> divide(10)
res1: Int = 4

scala> divide(0)
java.lang.ArithmeticException: / by zero
  at $anonfun$1.apply$mcII$sp(<console>:10)
  ... 33 elided

scala> val divide = new PartialFunction[Int, Int] { def apply(x: Int) = 42 / x
     | def isDefinedAt(x: Int) = x != 0 }
divide: PartialFunction[Int,Int] = <function1>

scala> divide.isDefinedAt(1)
res3: Boolean = true

scala> if (divide.isDefinedAt(1)) divide(1)
res4: AnyVal = 42

scala> divide.isDefinedAt(0)
res5: Boolean = false

scala> if (divide.isDefinedAt(0)) divide(0)
res6: AnyVal = ()

scala> val divide2: PartialFunction[Int, Int] = { case d: Int if d != 0 => 42 / d
     | }
divide2: PartialFunction[Int,Int] = <function1>

scala> divide2.isDefinedAt(0)
res7: Boolean = false

scala> divide2.isDefinedAt(1)
res8: Boolean = true

scala> if (divide2.isDefinedAt(1)) divide(1)
res9: AnyVal = 42

scala> if (divide2.isDefinedAt(0)) divide(0)
res10: AnyVal = ()

