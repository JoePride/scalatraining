// import scala.io.StdIn.readLine <- This only works in Scala 2.11 or later.
// Earlier, don't bother.
// Interesting point that the IntelliJ IDE calls you out on an ambiguous
// reference, but the Scala version won't accept the recommended fix.
//

println(
  """|This will keep reading lines until you feed it an empty line.
     |It will read the first line regardless of what you put in,
     |and then decide whether to continue.""".stripMargin)

var line = ""
do {
  line = readLine()
  println("Read: " + line)
} while (line != "")