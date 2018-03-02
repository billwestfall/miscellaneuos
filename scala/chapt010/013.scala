scala> val x = List(15, 10, 5, 8, 20, 12)
x: List[Int] = List(15, 10, 5, 8, 20, 12)

scala> x
res0: List[Int] = List(15, 10, 5, 8, 20, 12)

scala> val y = x.groupBy(_ > 10)
y: scala.collection.immutable.Map[Boolean,List[Int]] = Map(false -> List(10, 5, 8), true -> List(15, 20, 12))

scala> val y = x.partition(_ > 10)
y: (List[Int], List[Int]) = (List(15, 20, 12),List(10, 5, 8))

scala> val y = x.span(_ < 20)
y: (List[Int], List[Int]) = (List(15, 10, 5, 8),List(20, 12))

scala> val y = x.splitAt(2)
y: (List[Int], List[Int]) = (List(15, 10),List(5, 8, 20, 12))

scala> val (a,b) = x.partition(_ > 10)
a: List[Int] = List(15, 20, 12)
b: List[Int] = List(10, 5, 8)

scala> val groups = x.groupBy(_ > 10)
groups: scala.collection.immutable.Map[Boolean,List[Int]] = Map(false -> List(10, 5, 8), true -> List(15, 20, 12))

scala> val trues = groups(true)
trues: List[Int] = List(15, 20, 12)

scala> val falses = groups(false)
falses: List[Int] = List(10, 5, 8)

scala> val nums = (1 to 5).toArray
nums: Array[Int] = Array(1, 2, 3, 4, 5)

scala> nums.sliding(2).toList
res1: List[Array[Int]] = List(Array(1, 2), Array(2, 3), Array(3, 4), Array(4, 5))

scala> nums.sliding(2,2).toList
res2: List[Array[Int]] = List(Array(1, 2), Array(3, 4), Array(5))

scala> nums.sliding(2,3).toList
res3: List[Array[Int]] = List(Array(1, 2), Array(4, 5))

scala> val listOfTuple2s = List((1,2), ('a', 'b'))
listOfTuple2s: List[(AnyVal, AnyVal)] = List((1,2), (a,b))

scala> val x = listOfTuple2s.unzip
x: (List[AnyVal], List[AnyVal]) = (List(1, a),List(2, b))

scala> val couples = List(("Kim", "Al"), ("Julia", "Terry"))
couples: List[(String, String)] = List((Kim,Al), (Julia,Terry))

scala> val (women, men) = couples.unzip
women: List[String] = List(Kim, Julia)
men: List[String] = List(Al, Terry)

scala> val women = List("Kim", "Julia")
women: List[String] = List(Kim, Julia)

scala> val men = List("Al", "Terry")
men: List[String] = List(Al, Terry)

scala> val couples = women zip men
couples: List[(String, String)] = List((Kim,Al), (Julia,Terry))

scala> 
