import java.util.StringJoiner

fun main(){
    println("Porfavor introduzca su email: ")

    var email = readln().matches(Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}\$"))
   // var email2= email

    println("Tu email es $email")



    if(email.equals(true)){
        println("Tu email es valido y es  ")//preguntar como sacar el string de el readln

    }else{
        println("tu email es invalido")
        do {
            println("Porfavor introduzca su email otra vez: ")
            var email2 = readln().matches(Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}\$"))
        }while(!email2)
        println("Tu email es valido")
    }




    //preguntar al profe como sacar un string de el readln





}