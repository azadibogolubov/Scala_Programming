// Based on chapter 7 of Programming in Scala 2nd Edition
object FileListing
{
	def main(args: Array[String])
	{
		val filesHere = (new java.io.File(".")).listFiles
		var i = 1
		println("Listing contents of current directory")
		for (file <- filesHere)
		{
			println(i + ". " + file)
			i = i + 1
		}
		
		println("")
		println("Now listing all .scala files")
		for (file <- filesHere
		 	if file.isFile 
			if file.getName.endsWith(".scala"))
			println(file)
	}
}
