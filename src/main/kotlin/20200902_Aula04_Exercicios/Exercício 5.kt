package `20200902_Aula04_Exercicios`

fun main (){
    println(compararNumeros(91,5,9, 99))
}

fun compararNumeros(a :Int, b:Int, c:Int, d:Int): Boolean {

//    if ((a > c && a > d) || (b > c && b > d)) {
//            return true
//        } else {
//            return false
//    }
//}

    return (a > c && a > d) || (b > c && b > d)

}


