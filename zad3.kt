fun main(){
    try {
        print("Введите значение M: ")
        val m = readLine()!!.toInt()
        print("Введите значение N: ")
        val n = readLine()!!.toInt()
        if (m >= n) {
            println("Ошибка: M должно быть меньше N")
            return
        }
        print("Введите первый член прогрессии: ")
        val a1 = readLine()!!.toDouble()
        print("Введите разность прогрессии: ")
        val d = readLine()!!.toDouble()
        var sumToN = 0.0
        when {
            n < 0 -> {
                println("Ошибка")
                return
            }
            n == 0 -> sumToN = 0.0
            else -> sumToN = (n / 2.0) * (2 * a1 + (n - 1) * d)
        }
        val k = m - 1
        var sumToM = 0.0
        when {
            k < 0 -> sumToM = 0.0
            k == 0 -> sumToM = 0.0
            else -> sumToM = (k / 2.0) * (2 * a1 + (k - 1) * d)
        }
        val result = sumToN - sumToM
        println("Сумма членов прогрессии с номерами от $m до $n равна: $result")
    } catch (e: NumberFormatException) {
        println("Ошибка")
    }
}