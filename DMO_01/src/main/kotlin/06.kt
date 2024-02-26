fun main() {

    val inputA: Int = getUserInputFriend("Insira o valor do primeiro número")
    val inputB: Int = getUserInputFriend("Insira o valor do segundo número")

    val a: Int = sumDiv(inputA)
    val b: Int =  sumDiv(inputB)

    if(a == b){
        println("${inputA} ${inputB} são números amigaveis, pois o somatorio do seus divisores resultam ${a}")
    }else{
        println("${inputA} ${inputB} não são números amigaveis, pois o somatorio do seus divisores resultam em ${a} e ${b} respectivamente.")
    }
}

fun sumDiv(a : Int): Int{
    var div : Double = 1.0
    var rs : Double = 0.0
    var sum : Int = 0
    while(div <= a){
        rs = (a / div) - (a / div).toInt()
        if(rs == 0.0){
            sum += div.toInt()
        }
        div += 1
    }
    return sum
}

fun getUserInputFriend(msg : String): Int{
    println(msg)
    return getIntFromConsoleFriend()
}

fun getIntFromConsoleFriend(): Int{
    try{
        return readLine()!!.toInt()
    } catch (e: Exception){
        println("Erro: Não foi possível realizar o parser do inteiro.")
        return getIntFromConsoleFriend()
    }
}