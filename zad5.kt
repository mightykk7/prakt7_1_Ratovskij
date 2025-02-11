fun main(){
    try {
    println("Введите кол-во учеников")
    val n: Int = readLine()!!.toInt()
    if (n<=0){
        println("Неверные данные")
        return
    }
    println("Введите кол-во пятерок")
    val a: Int = readLine()!!.toInt()
    println("Введите кол-во четверок")
    val b: Int = readLine()!!.toInt()
    println("Введите кол-во двоек")
    val c: Int = readLine()!!.toInt()
    if (n<(a+b+c))
        {
        println("Кол-во оценок должно совподать с кол-вом учеников")
        }
    val d = n - (a+b+c)
    val p = ((d.toDouble()/n) * 100)
    println("Троек в классе равен $p %")
    }catch (e: NumberFormatException) {
            println("Ошибка")
    }
}