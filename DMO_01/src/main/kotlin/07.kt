fun main() {

    var menu : Int = 1
    var list_pos: MutableList<Int> = mutableListOf<Int>()
    var list_neg: MutableList<Int> = mutableListOf<Int>()
    var input_int : Int = 0

    while(menu == 1){
        printMenu()
        menu = getIntFromConsoleLoop()
        if(menu == 1){
            input_int = getUserInputLoop("Insira o valor: ")
            if(input_int >= 0) {
                list_pos.add(input_int)
            }else{
                list_neg.add(input_int)
            }
        }
    }
    list_pos.sort()
    list_neg.reverse()
    try{
        println("Menor valor possitivo: ${list_pos[0]}")
    } catch (e: Exception){
        print("Não foi informado valor positivo")
    }
    try{
        println("Maior valor negativo: ${list_neg[0]}")
    } catch (e: Exception){
        print("Não foi informado valor negativo")
    }


}

fun printMenu(){
    println("1) Insira um número ")
    println("2) continue...")
    print("----> ")
}

fun getUserInputLoop(msg : String): Int{
    print(msg)
    return getIntFromConsoleLoop()
}

fun getIntFromConsoleLoop(): Int{
    try{
        return readLine()!!.toInt()
    } catch (e: Exception){
        println("Erro: Não foi possível realizar o parser do inteiro.")
        return getIntFromConsoleLoop()
    }
}