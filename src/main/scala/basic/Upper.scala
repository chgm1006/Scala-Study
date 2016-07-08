package basic

/**
  * Created by Forrest on 2016. 6. 29..
  */
class Upper {
  def upper(strings:String*):Seq[String]={
    strings.map((s:String)=> s.toUpperCase())
  }
}

val up = new Upper
println(up.upper("Hello", "World"))
