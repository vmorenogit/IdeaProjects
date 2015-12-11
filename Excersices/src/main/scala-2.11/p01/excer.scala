package p01

import p01._

/**
  * Created by vmoreno on 1/12/15.
  */
object excer {
  def main(args: Array[String]) {
    val obj1 = new ChecksumAccumulator()
    obj1.add(0)
    println(obj1.checksum())
    obj1.add(-1)
    println(obj1.checksum())
  }
}
