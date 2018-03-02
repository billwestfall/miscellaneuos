scala> val lol = List(List(1,2), List(3,4))
lol: List[List[Int]] = List(List(1, 2), List(3, 4))

scala> val result = lol.flatten
result: List[Int] = List(1, 2, 3, 4)

scala> val a = Array(Array(1,2), Array(3,4))
a: Array[Array[Int]] = Array(Array(1, 2), Array(3, 4))

scala> a.flatten
res0: Array[Int] = Array(1, 2, 3, 4)

scala> val couples = List(List("kim", "al"), List("julia", "terry"))
couples: List[List[String]] = List(List(kim, al), List(julia, terry))

scala> val people = couples.flatten
people: List[String] = List(kim, al, julia, terry)

scala> val people = couples.flatten.map(_.capitalize).sorted
people: List[String] = List(Al, Julia, Kim, Terry)

scala> val myFriends = List("Adam", "David", "Frank")
myFriends: List[String] = List(Adam, David, Frank)

scala> val adamsFriends = List("Nick K", "Bill M")
adamsFriends: List[String] = List(Nick K, Bill M)

scala> val davidsFriends = List("Becca G", "Kenny D", "Bill M")
davidsFriends: List[String] = List(Becca G, Kenny D, Bill M)

scala> val friendsOfFriends = List(adamsFriends, davidsFriends)
friendsOfFriends: List[List[String]] = List(List(Nick K, Bill M), List(Becca G, Kenny D, Bill M))

scala> val uniqueFriendsOfFriends = friendsOfFriends.flatten.distinct
uniqueFriendsOfFriends: List[String] = List(Nick K, Bill M, Becca G, Kenny D)

scala> val list = List("Hello", "world")
list: List[String] = List(Hello, world)

scala> list.flatten
res1: List[Char] = List(H, e, l, l, o, w, o, r, l, d)

scala> val x = Vector(Some(1), None, Some(3), None)
x: scala.collection.immutable.Vector[Option[Int]] = Vector(Some(1), None, Some(3), None)

scala> x.flatten
res2: scala.collection.immutable.Vector[Int] = Vector(1, 3)

scala> 
