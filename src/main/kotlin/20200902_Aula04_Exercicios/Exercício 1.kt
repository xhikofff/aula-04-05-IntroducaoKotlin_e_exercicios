package `20200902_Aula04_Exercicios`

fun main (){
    println(maiorNumero(91,599,9))
}
fun maiorNumero(a :Int, b:Int, c:Int): Int {
    var maior = 0

    if (a > b) {
        if (a > c) {
            maior = a
        }
        else {
            maior = c
        }
    }
    else if (c > b) {
        maior = c
    }
    else {
        maior = b
    }
    return maior
}