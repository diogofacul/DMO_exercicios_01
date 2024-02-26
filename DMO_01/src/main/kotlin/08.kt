import java.math.BigInteger

fun main() {

    val a: Int = getUserInputFacto("Insira o valor do valor")
    println("Resultado de !${a}: ${factorial(a)}")
}

fun factorial(a : Int) : BigInteger{
    var rs : BigInteger = BigInteger("1")
    for( i in (1 .. a)){
        rs = rs * i.toBigInteger()
    }
    return rs
}

fun getUserInputFacto(msg : String): Int{
    println(msg)
    return getIntFromConsoleFacto()
}

fun getIntFromConsoleFacto(): Int{
    try{
        return readLine()!!.toInt()
    } catch (e: Exception){
        println("Erro: Não foi possível realizar o parser do inteiro.")
        return getIntFromConsoleFacto()
    }
}