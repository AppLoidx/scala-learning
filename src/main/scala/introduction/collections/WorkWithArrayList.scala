package introduction.collections

import java.util

/**
 * @author Arthur Kupriyanov
 */
object WorkWithArrayList extends App {

  // NOTE:  Array - it's basic array (int[] a = new int[5])
  //        ArrayList - from util java collections


  // var a:util.ArrayList["String"] = new util.ArrayList["String"]()
  /*
  Error: type mismatch;
  found   : String("Some string")
  required: "String"

      in a.add("Some string")

   */


  var a:util.ArrayList[String] = new util.ArrayList[String]()

  a.add("Some string")
  a.add("Second string")

  println(a.get(0))
  println(a.get(1))
}
