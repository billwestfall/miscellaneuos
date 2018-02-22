scala> val v = Vector(1, 2, 3)
v: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)

scala> v,sum
<console>:1: error: ';' expected but ',' found.
v,sum
 ^

scala> v.sum
res0: Int = 6

scala> v.filter(_ > 1)
res1: scala.collection.immutable.Vector[Int] = Vector(2, 3)

scala> v.map(_ * 2)
res2: scala.collection.immutable.Vector[Int] = Vector(2, 4, 6)

scala> var v = Vector[Int]()
v: scala.collection.immutable.Vector[Int] = Vector()

scala> for (i <- 1 to 50000) v = v :+ i

scala> val x = List(1, 2.0, 33D, 400L)
x: List[Double] = List(1.0, 2.0, 33.0, 400.0)

scala> val x = List[Number](1, 2.0, 33D, 400L)
x: List[Number] = List(1, 2.0, 33.0, 400)

scala> val x = List[AnyVal](1, 2.0, 33D, 400L)
x: List[AnyVal] = List(1, 2.0, 33.0, 400)

scala> trait Animal
defined trait Animal

scala> trait FurryAnimal extends Animal
defined trait FurryAnimal

scala> case class Dog(name: String) extends Animal
defined class Dog

scala> case class Cat(name: String) extends Animal
defined class Cat

scala> val x = Array(Dog("Fido"), Cat("Felix"))
x: Array[Product with Serializable with Animal] = Array(Dog(Fido), Cat(Felix))

scala> val x = Array[Animal](Dog("Fido"), Cat("Felix"))
x: Array[Animal] = Array(Dog(Fido), Cat(Felix))

