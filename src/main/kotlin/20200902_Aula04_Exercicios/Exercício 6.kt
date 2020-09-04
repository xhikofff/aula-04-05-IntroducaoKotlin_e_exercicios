package `20200902_Aula04_Exercicios`

fun main (){
    println(inteirosPositivos())
}
fun inteirosPositivos(): ArrayList<Int> {
    var lista = arrayListOf<Int>()
    for (num in 1..100 ) {
        lista.add(num)
    }
    return lista
}