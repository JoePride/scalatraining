class ChecksumAccumulator{
  private var sum = 0
  def add(b: Byte):Unit = { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}

val sumObj = new ChecksumAccumulator

sumObj.add(5)
println("Added 5")
println(sumObj.checksum)
sumObj.add(25)
println("Added 25")
println(sumObj.checksum)
println("And it's over!")
