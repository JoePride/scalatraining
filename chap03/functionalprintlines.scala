import scala.io.Source

def Max(a: Int, b: Int): Int ={
  if (a > b) a
  else b
}

def getMaxLineLength(iteratorOfStrings: Iterator[String], maxLength: Int): Int = {
  if (!iteratorOfStrings.hasNext) {
    maxLength
  } else {
    val curLineLength = iteratorOfStrings.next().length
    getMaxLineLength(iteratorOfStrings, Max(curLineLength,maxLength))
  }
}

def digitsInInt(i: Int, logSoFar: Int = 1): Int = {
  if (i < 10 && i > -10){
    logSoFar
  } else {
    digitsInInt(i/10, logSoFar + 1)
  }
}

def outputLine(lineString: String, maxNumDigitsInLineLength: Int): Unit = {
  val lineLength = lineString.length
  val digitsInLineLength = digitsInInt(lineLength)
  val padding = " " * (maxNumDigitsInLineLength - digitsInLineLength)
  println(padding + lineLength + " | " + lineString)
}

def outputLinesFromIteratorWithLineNumbers(iteratorOfStrings: Iterator[String], maxNumDigitsInLineLength: Int): Unit = {
  if(!iteratorOfStrings.hasNext) {
    ()
  } else {
    outputLine(iteratorOfStrings.next(),maxNumDigitsInLineLength)
    outputLinesFromIteratorWithLineNumbers(iteratorOfStrings, maxNumDigitsInLineLength)
  }
}

if(args.length > 0) {
  val firstPassToGetMaxLength_Source = Source.fromFile(args(0))
  val firstPassIterator = firstPassToGetMaxLength_Source.getLines()
  val maxLineLength = getMaxLineLength(firstPassIterator, 0)
  val maxDigits = digitsInInt(maxLineLength)
  val secondPassToGetLines_Source = Source.fromFile(args(0))
  val secondPassIterator = secondPassToGetLines_Source.getLines()
  outputLinesFromIteratorWithLineNumbers(secondPassIterator,maxDigits)
}
