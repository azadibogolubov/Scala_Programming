// Based on chapter 7 of Programming in Scala 2nd Edition
object FileListing
{
	def main(args: Array[String])
	{
		val filesHere = (new java.io.File(".")).listFiles
		val pattern = args(0)
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

		for 
                {
                        file <- filesHere
                        if file.getName.endsWith(".scala")
                        line <- fileLines(file)
                        trimmed = line.trim
                        if trimmed.matches(pattern)
                }
                println(file + ": " + trimmed)
	}
	
	def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines().toList
}
