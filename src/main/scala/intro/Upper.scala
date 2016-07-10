package intro

/**
  * Created by Forrest on 2016. 7. 11..
  */
object Upper {
  def main(args: Array[String]) = {
    args.map(_.toUpperCase()).foreach(printf("%s ", _))
    println("")

  }


}
