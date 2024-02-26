fun main() {

    val a: Double = getUserInputDouble("Insira o valor do primeiro lado")
    val b: Double = getUserInputDouble("Insira o valor do segundo lado")
    val c: Double = getUserInputDouble("Insira o valor do terceiro lado")

    if(a == b && a == c && b == c){
        println("É um Triangulo Equilatero")
    } else {
        if(a != b && a != c && b != c){
            println("É um Triangulo Escaleno")
        }else {
            println("É um Triangulo Isósceles")
        }
    }
}

fun getUserInputDouble(msg : String): Double {
    println(msg)
    return getDoubleFromConsole()
}

fun getDoubleFromConsole(): Double {
    try{
        return readLine()!!.toDouble()
    } catch (e: Exception){
        println("Erro: Não foi possível realizar o parser do double.")
        return getDoubleFromConsole()
    }
}