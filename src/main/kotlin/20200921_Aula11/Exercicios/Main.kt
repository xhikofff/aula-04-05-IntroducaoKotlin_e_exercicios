package `20200921_Aula11`.Exercicios

import java.lang.Exception

fun main() {
    println("\n=== Exercício 1 ===")

    var lista = mutableListOf<String>()
    lista.add("Pato")
    lista.add("Gato")
    lista.add("Cachorro")

    try {
        println("Posição 3 (lista): ${lista[3]}")
    } catch (ex: Exception) {
        println("Ocorreu uma exceção: ${ex.message}")
        println(ex.stackTrace)
        println("\n")
    }

    println("\n=== Exercício 2 ===")

    try {
        var listaNull = mutableListOf<String?>(null)

        listaNull.add("Pato")
        listaNull.add("Gato")
        listaNull.add("Cachorro")

        println("Posição 2 (listaNull): ${listaNull[2]}")
    } catch (ex: Exception) {
        println("Ocorreu uma exceção: ${ex.message}")
        println(ex.stackTrace)
        println("\n")
    }


    try {
        var listaNull2: MutableList<String>? = null

        listaNull2!!.add("Pato")
        listaNull2!!.add("Gato")
        listaNull2!!.add("Cachorro")

        println("Posição 2 (listaNull2): ${listaNull2[2]}")
    } catch (ex: Exception) {
        println("Ocorreu uma exceção: ${ex.message}")
        println(ex.stackTrace)
        println("\n")
    }


    try {
        var lista2 = mutableListOf<String>()

        lista2.add("Pato")
        lista2.add("Gato")
        lista2.add("Cachorro")

        println("Posição 2 (lista2): ${lista2[5]}")
    } catch (ex: Exception) {
        println("Ocorreu uma exceção: ${ex.message}")
        println(ex.stackTrace)
        println("\n")
    }

}