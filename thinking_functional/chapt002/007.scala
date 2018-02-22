scala> List(1,2,3,4,5)map(_+1)
res0: List[Int] = List(2, 3, 4, 5, 6)

scala> val words = List("the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog")
words: List[String] = List(the, quick, brown, fox, jumped, over, the, lazy, dog)

scala> words map (_.length)
res1: List[Int] = List(3, 5, 5, 3, 6, 4, 3, 4, 3)

scala> List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9)) flatMap (_.toList)
res2: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> words flatMap (_.toList)
res3: List[Char] = List(t, h, e, q, u, i, c, k, b, r, o, w, n, f, o, x, j, u, m, p, e, d, o, v, e, r, t, h, e, l, a, z, y, d, o, g)

scala> List.range(1, 10) reduceLeft((a, b) => a + b)
res4: Int = 45

scala> List.range(1, 11) reduceLeft((a, b) => a + b)
res5: Int = 55

scala> List.range(1, 10) reduceRight(_ - _)
res6: Int = 5

scala> //the above subtracts from right to left then adds all values to a total

scala> words.reduceLeft((a, b) => if (a.length > b.length) a else b)
res7: String = jumped

scala> words.reduceLeft((a, b) => if (a.length < b.length) a else b)
res8: String = dog

scala> List.range(1, 10).foldLeft(0)(_ + _)
res9: Int = 45

scala> (0 /: List.range(1, 10)) (_ + _)
res10: Int = 45

scala> (List.range(1, 10) :\ 0) (_ - _)
res11: Int = 5
