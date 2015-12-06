object InfiniteLoop
{
	def main(args: Array[String])
	{
		var a = 10;
		while (true)
		{
			println("a = " + a);
			a = a+1;
		}
	}
}
