import java.util.Scanner
fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var num1 = read.nextFloat()
    var num2 = read.nextFloat()
    var num3 = read.nextFloat()

    println("MEDIA = %.1f".format((num1 * 2 + num2 * 3 + num3 * 5) / 10))
}
