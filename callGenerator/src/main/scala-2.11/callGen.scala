import scala.io.Source
/**
  * Created by vmoreno on 6/12/15.
  */



object callGen {

  val filename="/home/vmoreno/IdeaProjects/callGenerator/src/main/resources/pnn_pg_small.csv"
  //val whereami = System.getProperty("user.dir")

  def main(args: Array[String]): Unit = {

    val fileIn = Source.fromFile(filename).getLines()

    val header = fileIn.take(1).next()

    //println(header)

    for(lines <- fileIn) {

      println(lines.filter(!"\"".contains(_)))

    }
  }
}
