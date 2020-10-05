var filename = "default.txt"
val args = List("samplefilename.txt")
if (!args.isEmpty)
  filename = args(0)
println(
  s"""|var filename = "default.txt"
      |val args = List("samplefilename.txt")
      |if (!args.isEmpty)
      |  filename = args(0)
      |Therefore, filename: $filename""".stripMargin)

val filename2 = if (!args.isEmpty) args(0) else "default.txt"

println(
  s"""|val filename2 = if (!args.isEmpty) args(0) else "default.txt"
      |Therefore, filename2: $filename2""".stripMargin)