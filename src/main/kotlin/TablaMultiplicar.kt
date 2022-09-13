
fun main(arg: Array<String>) {

    val intervaloTabla= 1..999999

    print("Ingrese un numero: ")
    var num : Int = readln().toInt()
    println(num)


    print("Ingrese un numero: ")
    var num2 : Int = readln().toInt()
    println(num2)

    val valor= num.rangeTo(num2)
   // val tabla= num?.and(num2!!)

    for(num in valor){
        println("Multiplos de $num: ")
        for(i in 1..10){
            val resultado=num*i
            println(resultado)
        }
        println()
    }



}