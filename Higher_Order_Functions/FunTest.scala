// From: http://docs.scala-lang.org/tutorials/tour/higher-order-functions.html

class Decorator(left: String, right: String)
{
	def layout[A](x: A) = left + x.toString() + right
}

object FunTest extends App
{
	def apply(f: String => String, v: String) = f(v)
	val decorator = new Decorator("[", "]")
	println(apply(decorator.layout, "Hello there"))
}
