object avgCalc {
    def avg(x: Int, y: Int): Float = {
        val mean = (x + y).toFloat / 2
        println(f"The average of the two numbers $x and $y is ${mean}%.2f")
        mean
    }

    def main(args: Array[String]): Unit = {
        val x = 5
        val y = 18
        avg(x, y)
    }
}
