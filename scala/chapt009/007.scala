scala> val sum = (a: Int, b: Int, c: Int) => a + b + c
sum: (Int, Int, Int) => Int = <function3>

scala> val f = sum(1, 2, 3)
f: Int = 6

scala> val f = sum(1, 2, _: Int)
f: Int => Int = <function1>

scala> f(3)
res0: Int = 6

scala> f(4)
res1: Int = 7

scala> def wrap(prefix: String, html: String, suffix: String) = {
     |       prefix + html + suffix
     |     }
wrap: (prefix: String, html: String, suffix: String)String

scala> val wrapWithDiv = wrap("<div>", _: String, "</div>")
wrapWithDiv: String => String = <function1>

scala> wrapWithDiv("<p>Hello, world</p>")
res2: String = <div><p>Hello, world</p></div>

scala> wrapWithDiv("<img src=\"/images/foo.png\" />")
res3: String = <div><img src="/images/foo.png" /></div>

scala> wrap("<pre>", "val x = 1", "</pre>")
res4: String = <pre>val x = 1</pre>
