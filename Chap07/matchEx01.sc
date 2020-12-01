val args = List("chips", "eggs", "kumquats")

// Approach 1

val firstArg = if (args.nonEmpty) args.head else ""

firstArg match {
  case "salt" => println("pepper")
  case "chips" => println("salsa")
  case "eggs" => println("bacon")
  case _ => println("huh?")
}

// Approach 2

for (curArg <- args){
  val friend = curArg match {
    case "salt" => "pepper"
    case "chips" => "salsa"
    case "eggs" => "bacon"
    case _ => "huh?"
  }
  println(friend)
}