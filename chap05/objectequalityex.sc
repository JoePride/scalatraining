println(
  s"""|Scala == method for objects is meant to compare the contents of two
      |objects and show that they are equal. It doesn't necessarily mean
      |that the two are the same object, only that the contents of the
      |object are equal. Here are some examples.
      |
      |Basic types.
      |
      |1 == 2 : ${1 == 2}
      |1 != 2 : ${1 != 2}
      |2 == 2 : ${2 == 2}
      |1 == 2 && 2 == 2 : ${1 == 2 && 2 == 2}
      |1 == 2 || 2 == 2 : ${1 == 2 || 2 == 2}
      |
      |Now some objects.
      |
      |List(1, 2, 3) == List(1, 2, 3) : ${List(1, 2, 3) == List(1, 2, 3)}
      |List(1, 2, 3) == List(4, 5, 6) : ${List(1, 2, 3) == List(4, 5, 6)}
      |
      |Comparing objects of different types.
      |
      |1 == 1.0 : ${1 == 1.0}
      |List(1, 2, 3) == \"hello\" : ${List(1,2,3) == "hello"}
      |
      |Comparing objects to null.
      |
      |List(1, 2, 3) == null : ${List(1, 2, 3) == null}
      |null == List(1, 2, 3) : ${null == List(1, 2, 3)}
      |null == null : ${null == null}
      |
      |Works on different objects with the same contents.
      |
      |(\"he\" + \"llo\") == \"hello\" : ${("he" + "llo") == "hello"}
      |
      |Comparing object equality with contents equality:
      |
      |var listy = List(1, 2, 3)
      |var listy2 = List(2, 3, 4)
      |listy2 = List(1, 2, 3)
      |val listy3 = List(1, 2, 3)
      |val listy4 = listy""".stripMargin)

var listy = List(1, 2, 3)
var listy2 = List(2, 3, 4)
listy2 = List(1, 2, 3)
val listy3 = List(1, 2, 3)
val listy4 = listy

println(
  s"""|
      |listy == listy2 : ${listy == listy2}
      |listy eq listy2 : ${listy eq listy2}
      |listy == listy3 : ${listy == listy3}
      |listy eq listy3 : ${listy eq listy3}
      |listy == listy4 : ${listy == listy4}
      |listy eq listy4 : ${listy eq listy4}""".stripMargin)