fun main() {

    val a: Int = getUserInput("Insira o valor do primeiro lado")
    val b: Int = getUserInput("Insira o valor do segundo lado")

    if(a == b){
        println("É um Quadrado")
    } else {
        println("É um Retangulo")
    }
}

fun getUserInput(msg : String): Int{
    println(msg)
    return getIntFromConsole()
}

fun getIntFromConsole(): Int{
    try{
        return readLine()!!.toInt()
    } catch (e: Exception){
        println("Erro: Não foi possível realizar o parser do inteiro.")
        return getIntFromConsole()
    }
}