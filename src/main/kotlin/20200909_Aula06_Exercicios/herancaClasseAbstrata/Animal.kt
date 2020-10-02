package `20200909_Aula06_Exercicios`.herancaClasseAbstrata

abstract class Animal(open val idade: Int = 0, open val especie: String = "") {

    open fun locomover() {}

    fun idade() {
        println("Animal tem idade de $idade e é da espécie $especie")
    }

    abstract fun come(comida: String): String
}