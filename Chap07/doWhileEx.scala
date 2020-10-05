import scala.io.StdIn.readLine

println(
  """|This will keep reading lines until you feed it an empty line.
     |It will read the first line regardless of what you put in,
     |and then decide whether to continue.""".stripMargin)

var line = ""
do {
  line = readLine()
  println("Read: " + line)
} while (line != "")