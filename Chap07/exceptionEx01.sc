val n = 16

val half =
  if (n % 2 == 0)
    n/2
  else
    throw new RuntimeException("n must be even")

class BullshitException(message: String) extends Exception(message){
  def this(message: String, cause: Throwable) {
    this(message)
    initCause(cause)
  }

  def this(cause: Throwable) {
    this(Option(cause).map(_.toString).orNull, cause)
  }

  def this() {
    this(null: String)
  }
}

def thisEffinMethod(shouldItWork: Boolean) = {
  if(shouldItWork)
    println("It worked against all odds!")
  else
    throw new BullshitException("It definitely did not work.")
}

try{
  thisEffinMethod(false)
} catch {
  case endResult: BullshitException => {
    println(endResult.getMessage)
  }
} finally {
  println("Well, what did you expect, huh?")
}

def f(): Int = try return 1 finally return 2

println(f)

import java.net.URL
import java.net.MalformedURLException

def urlFor(path: String) = {
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException =>
      new URL("http://www.scala-lang.org")
  }
}

println(urlFor("/opt/google/chrome/nacl_helper"))
println(urlFor("https://www.google.com"))
println(urlFor("glarkuflimble"))
println(urlFor("file:///opt/google/chrome/nacl_helper"))

def g(): Int = try 1 finally 2

println(g)