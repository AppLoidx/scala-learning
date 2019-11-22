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

}
