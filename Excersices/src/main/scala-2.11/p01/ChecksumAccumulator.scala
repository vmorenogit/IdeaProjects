package p01

/**
  * Created by vmoreno on 1/12/15.
  */
class ChecksumAccumulator {
  private var sum = 0

  def add(b:Byte) { sum +=b }

  def checksum():Int = {
    ~(sum & 0xFF) + 1
  }
}
