scala> val double = (i: Int) => { i * 2 }
double: Int => Int = <function1>

scala> double(2)
res0: Int = 4

scala> double(3)
res1: Int = 6

scala> val list = List.range(1, 5)
list: List[Int] = List(1, 2, 3, 4)

scala> list.map(double)
res2: List[Int] = List(2, 4, 6, 8)

scala> val c = scala.math.cos(_)
c: Double => Double = <function1>

scala> c(0)
res3: Double = 1.0

scala> val p = scala.math.pow(_, _)
p: (Double, Double) => Double = <function2>

scala> p(scala.math.E, 2)
res4: Double = 7.3890560989306495

