scala> val numbers = List.range(1, 11)
numbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> numbers filter (_ % 3 == 0)
res0: List[Int] = List(3, 6, 9)

scala> val numbers = List.range(1, 111)
numbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110)

scala> numbers filter (_ % 3 == 0)
res1: List[Int] = List(3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99, 102, 105, 108)

scala> val words = List("the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog")
words: List[String] = List(the, quick, brown, fox, jumped, over, the, lazy, dog)

scala> words filter (_.length == 3)
res2: List[String] = List(the, fox, the, dog)

scala> numbers partition (_ % 3 == 0)
res3: (List[Int], List[Int]) = (List(3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99, 102, 105, 108),List(1, 2, 4, 5, 7, 8, 10, 11, 13, 14, 16, 17, 19, 20, 22, 23, 25, 26, 28, 29, 31, 32, 34, 35, 37, 38, 40, 41, 43, 44, 46, 47, 49, 50, 52, 53, 55, 56, 58, 59, 61, 62, 64, 65, 67, 68, 70, 71, 73, 74, 76, 77, 79, 80, 82, 83, 85, 86, 88, 89, 91, 92, 94, 95, 97, 98, 100, 101, 103, 104, 106, 107, 109, 110))

scala> numbers find (_ % 3 == 0)
res4: Option[Int] = Some(3)

scala> numbers find (_ < 0)
res5: Option[Int] = None

scala> List(1, 2, 3, -4, 5, 6, 7, 8, 9, 10) takeWhile (_ > 0)
res6: List[Int] = List(1, 2, 3)

scala> words dropWhile (_ startsWith "t")
res7: List[String] = List(quick, brown, fox, jumped, over, the, lazy, dog)

