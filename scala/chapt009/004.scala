scala> def exec(callback: Int => Unit) {
     | // invoke the function we were given, giving it an Int parameter
     |       callback(1)
     |     }
exec: (callback: Int => Unit)Unit

scala> def exec(callback: Int => Unit) {
     | // invoke the function we were given, giving it an Int parameter
     |       callback(1)
     |     }
exec: (callback: Int => Unit)Unit

scala> val plusOne = (i: Int) => { println(i+1) }
plusOne: Int => Unit = <function1>

scala> exec(plusOne)
2

scala> val plusTen = (i: Int) => { println(i+10) }
plusTen: Int => Unit = <function1>

scala> exec(plusTen)
11

scala> val sayHello = () => println("Hello")
sayHello: () => Unit = <function0>

scala> def executeXTimes(callback:() => Unit, numTimes: Int) { for (i <- 1 to numTimes) callback()
     | }
executeXTimes: (callback: () => Unit, numTimes: Int)Unit

scala> executeXTimes(sayHello, 3)
Hello
Hello
Hello

scala> def executeAndPrint(f:(Int, Int) => Int, x: Int, y: Int) { val result = f(x, y)
     | println(result)
     | }
executeAndPrint: (f: (Int, Int) => Int, x: Int, y: Int)Unit

scala> val result = f(x, y)
<console>:10: error: not found: value f
       val result = f(x, y)
                    ^
<console>:10: error: not found: value x
       val result = f(x, y)
                      ^
<console>:10: error: not found: value y
       val result = f(x, y)
                         ^

scala> val sum = (x: Int, y: Int) => x + y
sum: (Int, Int) => Int = <function2>

scala> val multiply=(x:Int,y:Int)=> x*y
multiply: (Int, Int) => Int = <function2>

scala> executeAndPrint(sum, 2, 9)
11

scala> executeAndPrint(multiply, 3, 9)
27

scala> executeAndPrint(multiply, 4, 8)
32

scala> def exec(callback: (Any, Any) => Unit, x: Any, y: Any) { callback(x, y)
     | }
exec: (callback: (Any, Any) => Unit, x: Any, y: Any)Unit

scala> val printTwoThings =(a: Any, b: Any) => { println(a)
     | println(b)
     | }
printTwoThings: (Any, Any) => Unit = <function2>

scala> case class Person(name: String)
defined class Person

scala> exec(printTwoThings, "Hello", Person("Dave"))
Hello
Person(Dave)

scala> def printTwoThings (a: Any, b: Any) { println(a)
     | println(b) }
printTwoThings: (a: Any, b: Any)Unit

scala> case class Person(name: String)
defined class Person

scala> exec(printTwoThings, "Hello", Person("Dave"))
Hello
Person(Dave)

