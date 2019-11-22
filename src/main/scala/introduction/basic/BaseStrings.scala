package introduction.basic

/**
 * @author Arthur Kupriyanov
 */
object BaseStrings extends App {
  val multilineString =
    """
      |.------..------..------..------..------..------.
      ||A.--. ||R.--. ||T.--. ||H.--. ||U.--. ||R.--. |
      || (\/) || :(): || :/\: || :/\: || (\/) || :(): |
      || :\/: || ()() || (__) || (__) || :\/: || ()() |
      || '--'A|| '--'R|| '--'T|| '--'H|| '--'U|| '--'R|
      |`------'`------'`------'`------'`------'`------'
      |""".stripMargin

  println(multilineString)

  var name = "Arthur"
  var nickname = "AppLoid"
  var additionalChar = '#'
  println(s"You name is $name. You nickname is $additionalChar${ "[" + nickname + "]" }")
}

/*
Output:

.------..------..------..------..------..------.
|A.--. ||R.--. ||T.--. ||H.--. ||U.--. ||R.--. |
| (\/) || :(): || :/\: || :/\: || (\/) || :(): |
| :\/: || ()() || (__) || (__) || :\/: || ()() |
| '--'A|| '--'R|| '--'T|| '--'H|| '--'U|| '--'R|
`------'`------'`------'`------'`------'`------'

You name is Arthur. You nickname is #[AppLoid]
 */
