object Fact {
   def main(args: Array[String]) {
      for (i <- 1 to 15)
         println(i + "!" + " = " + factorial(i) )
   }
   
   def factorial(n: BigInt): BigInt = {  
      if (n <= 1)
         1  
      else    
      n * factorial(n - 1)
   }
}
