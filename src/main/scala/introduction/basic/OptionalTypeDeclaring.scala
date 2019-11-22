package introduction.basic

/**
 * @author Arthur Kupriyanov
 */
object OptionalTypeDeclaring extends App {
  var a: String = "some value"  // preferred
  var b = "some value"          // unnecessarily verbose

  val c = "asdasd".stripMargin



  /* From Jet Brains:

  In particular, we’re considering enabling the enforcement of type
  annotations on public methods, and we’re definitely expecting
  a mixed reaction to that. Why declare some result types explicitly?
  Well, we believe that it’s one of those places where tools can mend
  possible abuse of certain liberties in the language design.

  Here are the reasons:

  Public methods and properties represent a so-called “public API,”
  which is a form of abstraction. Forcing API users to investigate
  the inner workings of public methods (or to guess the result type)
  is a sure way to break encapsulation and to degrade code quality.
  Explicit type annotation make public API well-marked and easy to use.

  Explicit result types can greatly improve code editing performance.
  Unlike the compiler, an IDE has to re-infer types on each code update.
  To optimize the workload, IntelliJ IDEA tries its best to cache and
  preserve as much type information as possible. However, as the result
  type of a method with omitted type annotation can change even on “external”
  update (i.e. update outside of the method body), IntelliJ has to re-process
  the whole content of such a method on almost any change (and the content might
  often consists of implicits, type-level arithmetic and whatnot). Considering the
  first point, adding type annotations to public methods makes your code more IDE-friendly
  (for the same reason, you may also choose to add explicit types to really complex yet non-public methods).

  Type annotations on public methods increase the speed of incremental
  compilation by minimizing the amount of recompiled code.
  Algorithms of incremental compilers (like SBT or IntelliJ) track “public API changes”
  and dependencies to determine what files need to be recompiled.
  Thus, if type of some method in a frequently used class is adjusted after code editing
  (but still lays within some “implied” base type), almost the whole project might often be
  unnecessary recompiled as a result. In a sense, this argument is a combination of the two
  previous ones but from the compiler’s standpoint. Official SBT documentation supports this
  argument by saying that “explicitly annotating return types of a public API is a good practice in general.”

  Note: One possible exception to these rules are simple declarations like "val answer = 42"
  where the result type is clearly evident, both for humans and for the compiler.
  Currently we’re determined to treat this kind of expressions separately.

  For example, if write code like this:

  /**
   * @author Arthur Kupriyanov
   */
  object BaseStrings {
    val multilineString = "some String value".split()
  }

   */
}
