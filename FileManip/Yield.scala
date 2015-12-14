// Based off of chapter 7 of Programming in Scala 2nd Edition
object Yield
{
	def main(args: Array[String])
	{
		val filesHere = (new java.io.File(".")).listFiles
		def scalaFiles = 
			for {
				file <- filesHere
				if file.getName.endsWith(".scala")
			} yield file
	}
}	
