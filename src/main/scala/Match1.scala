object Match1 {
  def main(args: Array[String]): Unit = {
    def getClassAsString(x: Any): String = x match {
      case s: String => s + " is a String"
      case i: Int => "Int"
      case f: Float => "Float"
      case l: List[_] => "List"
      //case p: Person => "Person"
      case _ => "Unknown"
    }
    print(getClassAsString("hello"))

  }
  //print(x)
}