object Main {
  def main(args:Array[String]){
    val n = 3.14159
    var a = scala.io.StdIn.readDouble()
    var b = scala.io.StdIn.readDouble()
    var c = scala.io.StdIn.readDouble()

    println("MEDIA = %.1f".format((a * 2 + b * 3 + c * 5) / 10))
  }
}
