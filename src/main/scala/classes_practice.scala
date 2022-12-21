class Person(var firstName: String, var lastName: String) {
  def printFullName() = println(s"$firstName $lastName")
}
object classes_practice extends App{

  val p = new Person("Julia", "Kern")
  println(p.firstName)
  p.lastName = "Manes"
  p.printFullName()
}
