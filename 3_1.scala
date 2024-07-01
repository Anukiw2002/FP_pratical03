object ReverseString {
  def reverse(phrase: String): String = {
    if (phrase.isEmpty) "" 
    else reverse(phrase.tail) + phrase.head 
  }

  def main(args: Array[String]): Unit = {
    val phrase = "Hello World!"
    val reversedString = reverse(phrase)
    println(s"The original string: $phrase")
    println(s"The reversed string: $reversedString")
  }
}
