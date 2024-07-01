object longStrings {
  def filter(list: Array[String]): Unit = {
    for (n <- list) { 
        n.length() > 5 match {
          case true => println(n) 
          case _ => 
        }
      }
    }

    def main (args : Array[String]) : Unit = {
        var list = Array("Mango", "Apple", "Banana", "Strawberry", "Pear", "Pineapple")
        filter(list)
    }
}