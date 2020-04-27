val testmap = Map("Name" -> "John Galt", "Question" -> "Who is John Galt?", "Real Question" -> "Who assigned us all to read this book?")
val superfunctionaltestmap = testmap + ("WTF Is" -> "A fountainhead?")
for (keyvaluepair <- superfunctionaltestmap){
  println(keyvaluepair._1 + " -> " + keyvaluepair._2)
}
