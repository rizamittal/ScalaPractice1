
object except {
  def main(args: Array[String]): Unit = {
    val a = 0
    val b = 10
    var c = 0
    try {
      c = b / a

    } catch {
      case a: ArithmeticException => {
        println("Divide By Zera Exception occured")
      }
    }
    print(c)
  }
}