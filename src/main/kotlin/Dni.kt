fun main() {
//letras validas «TRWAGMYFPDXBNJZSQVHLCKE»;RESIDUO(A1;23)+1;1)
    println("Porfavor introduzca su dni: ")
    var letras = "TRWAGMYFPDXBNJZSQVHLCKE"

    var dni = readln().matches(Regex("[0-9]{7,8}[$letras]"))
    // var email2= email
    println("Tu dni es $dni")

    //  println("Porfavor introduzca su dni bueno: ")
    // var dnicomprobado = readln()
    // dnicomprobado.matches(Regex("[0-9]{7,8} $letras"))
    //  //  dnicomprobado.matches(Regex("[0-9]{7,8} $letras"))
    //  //  var letra= letras.charAt(dnicomprobado % letras.length)

    var dniregex = """[0-9]{8}[$letras]""".toRegex()


    do {
        println("Dime tu dni dios: ")
        val input = readln()
        dni = input.matches(dniregex)
        if(dni) {
            println(input.findLast { dni })
        }
    } while (!dni)
    println("Tu dni es correcto")


}