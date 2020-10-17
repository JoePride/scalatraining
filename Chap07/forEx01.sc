println(
  """An example of for each, Scala style.
    |For (xx <- collectionName)
    |  doSomeStuff(xx)
    |
    |First we get a list of files in this location:
    |val filesHere = (new java.io.File(".")).listFiles()""".stripMargin)

val filesHere = (new java.io.File(".")).listFiles()

for (file <- filesHere)
  println(file)

println(
  """|Now, an example of iteration through a range.
     |for (i <- 1 to 4)
     |  println("Iteration " + i)""".stripMargin)

for (i <- 1 to 4)
    println("Iteration " + i)

println(
  """Total side note on ranges. If you want to
    |exclude the upper end of the range, use "until"
    |instead of "to."
    |
    |For (i <- 1 until 4)
    |  println("Iteration " + i)""".stripMargin)

for (i <- 1 until 4)
  println("Iteration " + i)

println(
  """Another way to iterate, commonly taught in elementary
    |C courses, but really not a typical technique in Scala.
    |
    |for (i <- 0 to filesHere.length - 1)
    |  println(filesHere(i))
    |
    |Besides being an unnecessarily geeky way to do it,
    |this may be inefficient if the collection you're
    |iterating over is a List instead of an Array.""".stripMargin)

for (i <- 0 to filesHere.length - 1)
  println(filesHere(i))