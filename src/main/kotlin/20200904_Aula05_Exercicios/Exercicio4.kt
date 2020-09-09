package `20200904_Aula05_Exercicios`

fun main() {
    var tripe = Tripe(true,50,100,50)

    tripe.desdobrar()
    println(tripe.dobrado)
    println(tripe.alturaAtual)

    tripe.dobrar()
    println(tripe.dobrado)
    println(tripe.alturaAtual)

    tripe.prontoParaGuardar()
    println(tripe.dobrado)
    println(tripe.alturaAtual)

    tripe.prontoParaUsar()
    println(tripe.dobrado)
    println(tripe.alturaAtual)

    tripe.usar()
    println(tripe.dobrado)
    println(tripe.alturaAtual)

    tripe.guardar()
    println(tripe.dobrado)
    println(tripe.alturaAtual)

}