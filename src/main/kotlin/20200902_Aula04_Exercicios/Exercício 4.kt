package `20200902_Aula04_Exercicios`

fun main (){
    println(inteirosPositivosImpares())
}
fun inteirosPositivosImpares(): ArrayList<Int> {
    var lista = arrayListOf<Int>()
    for (num in 1..100 ) {
        if (num % 2 == 0){
        }
        else {
            lista.add(num)
        }
    }
    return lista
}