println(
  """You can filter a for expression by using the if statement.
    |val filesHere = (new java.io.file(".")).listFiles
    |for (file <- filesHere if file.getName.endsWith(".scala"))
    |  println(file)
    |
    |Prints filenames that end in .scala only. But more importantly,
    |performs that filtering on the collection before ever running
    |the body of the statement.""".stripMargin)

val filesHere = (new java.io.File(".")).listFiles

for (file <- filesHere if file.getName.endsWith(".sc"))
  println(file)

println(
  """In this case, you can do the same thing by using
    |a separate if statement:
    |
    |for (file <- filesHere)
    |  if(file.getName.endsWith(".scala"))
    |    println(file)
    |
    |The difference is, the for statement also returns a
    |result: The collection produced by the <- clauses.
    |So by filtering with an if statement in the for expression,
    |you can affect the collection that is returned. Whereas,
    |using an if statement in the body of the for expression
    |does not alter the collection returned.
    |
    |Next, using multiple if statements to further filter the
    |results:
    |
    |for (
    |  file <- filesHere
    |  if file.isFile
    |  if file.getName.endsWith(".sc")
    |) println(file)""".stripMargin)

for (
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".sc")
) println(file)