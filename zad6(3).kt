import kotlin.math.abs
import kotlin.math.ln

fun main() {
    try {
        println("Введите x")
        val x: Double = readLine()!!.toDouble()
        val a =Math.sqrt(abs(x)) * ln(Math.pow(x, 2.0))
        val b = -5 / (4 * x + Math.exp(x / 2))
        var resh = 0.0
        when {
            (b>0)->resh = a / b
            (b<0)->resh = a / b
            else ->
                println("Нет решения")
        }
        println(resh)
    } catch (e: NumberFormatException) {
        println("Ошибка")
    }
}