fun main() {

    val a: Int = getUserInputLines("Insira o número de linha")

    var j: Int = 1
    for( i in (1..a)){
        println("${j} ${j+1} ${j+2} PUM")
        j += 4
    }
}

fun getUserInputLines(msg : String): Int{
    println(msg)
    return getIntFromConsole1()
}

fun getIntFromConsole1(): Int{
    try{
        return readLine()!!.toInt()
    } catch (e: Exception){
        println("Erro: Não foi possível realizar o parser do inteiro.")
        return getIntFromConsole1()
    }
}