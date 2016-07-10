package intro

/**
  * Created by Forrest on 2016. 7. 11..
  */
object Upper2 {
  def main(args:Array[String])={
    val output = args.map(_.toUpperCase()).mkString("[", ", ", "]")
    println(output)
  }

}
