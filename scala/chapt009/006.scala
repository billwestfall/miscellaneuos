scala> val isOfVotingAge = (age: Int) => age >= 18
isOfVotingAge: Int => Boolean = <function1>

scala> isOfVotingAge(16)
res0: Boolean = false

scala> isOfVotingAge(20)
res1: Boolean = true

scala> var votingAge = 18
votingAge: Int = 18

scala> val isOfVotingAge = (age: Int) => age >= votingAge
isOfVotingAge: Int => Boolean = <function1>

scala> isOfVotingAge(16)
res2: Boolean = false

scala> isOfVotingAge(20)
res3: Boolean = true

scala> def printResult(f: Int => Boolean, x: Int) {
     |       println(f(x))
     |     }
printResult: (f: Int => Boolean, x: Int)Unit

scala> printResult(isOfVotingAge, 20)
true

scala> votingAge = 21
votingAge: Int = 21

scala> printResult(isOfVotingAge, 20)
false
