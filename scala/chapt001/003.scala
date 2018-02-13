scala> val nums = List(1,2,3,4,5).filter(_ < 4)
nums: List[Int] = List(1, 2, 3)

scala> val nums = List(1,2,3,4,5).filter(_ < 4).map(_ * 2)
nums: List[Int] = List(2, 4, 6)
