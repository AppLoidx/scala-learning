package introduction.basic

/**
 * @author Arthur Kupriyanov
 */
object ValOrVar extends App {

  val a = "some value"    // final String a = "some value"
  var b = "some value"    // String b = "some value"

  // a = "another value"
  // because a - it's immutable variable declared with "val" (like final in Java)
  b = "another value"

  /*

  But val is not equal to final in Java, at all.

  If you use final to ref-param you can change his object's state (if fields not declared as final)

  In Scala, val means your param is immutable (his state can't be changed)

  In this case, for example, you can use ArrayList declared as val
  var a:util.ArrayList[String] = new util.ArrayList[String]()

  you can't invoke function add(...) because in this operation you change state of object


   */

}
