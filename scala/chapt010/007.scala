scala> val days = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
days: Array[String] = Array(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday)

scala> days.zipWithIndex.foreach {
     | case(day, count) => println(s"$count is $day")
     | }
0 is Sunday
1 is Monday
2 is Tuesday
3 is Wednesday
4 is Thursday
5 is Friday
6 is Saturday

scala> val list = List("a", "b", "c")
list: List[String] = List(a, b, c)

scala> val zwi = list.zipWithIndex
zwi: List[(String, Int)] = List((a,0), (b,1), (c,2))

scala> val zwi2 = list.view.zipWithIndex
zwi2: scala.collection.SeqView[(String, Int),Seq[_]] = SeqViewZ(...)

scala> days.zipWithIndex.foreach { d => println(s"${d._2} is ${d._1}")
     | }
0 is Sunday
1 is Monday
2 is Tuesday
3 is Wednesday
4 is Thursday
5 is Friday
6 is Saturday

scala> val fruits = Array("apple", "banana", "orange")
fruits: Array[String] = Array(apple, banana, orange)

scala> for (i <- 0 until fruits.size) println(s"element $i is ${fruits(i)}")
element 0 is apple
element 1 is banana
element 2 is orange
