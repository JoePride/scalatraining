import scala.collection.mutable

object literalex {
  val recordMap = mutable.Map[Symbol,Any]()

  def updateRecordByName(r: Symbol, value: Any) = {
    recordMap += (r -> value)
  }

  def main(args: Array[String]) = {
      updateRecordByName('favoriteAlbum, "OK Computer")
      println(recordMap('favoriteAlbum))
      val s = 'favoriteAlbum
      val nm = s.name
      println(nm)
      println(recordMap(s))
      val name = "reader"
      println(s"Hello, $name!")
      println(s"The answer to the question of life, the universe, and everything is ${6*7}.")
      println(raw"No\\\\escape!") //prints: No\\\\escape!
      println(f"${math.Pi}%.5f")
      val pi = "Pi"
      println(f"$pi is approximately ${math.Pi}%.8f.")
  }
}
