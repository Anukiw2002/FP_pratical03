object EvenSum {
  def sumFun(numbers: Array[Int]): Int = {
    var initialSum = 0
    for (n <- numbers) {
      n % 2 match {
        case 0 => initialSum += n 
        case _ =>
      }
    }
    println(s"The sum of the even numbers is $initialSum")
    initialSum
  }

  def main(args: Array[String]): Unit = {
    val numbers = Array(2, 5, 8, 11, 15, 10, 25, 28, 32, 98)
    sumFun(numbers)
  }
}
