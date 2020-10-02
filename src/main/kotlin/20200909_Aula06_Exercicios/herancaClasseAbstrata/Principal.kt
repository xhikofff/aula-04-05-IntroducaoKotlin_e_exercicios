package `20200909_Aula06_Exercicios`.herancaClasseAbstrata

fun main() {

    println("\n=== OBJETO PESSOA ===")
    val brasileiro = Pessoa(19, "ser humano", "João")
    brasileiro.locomover()
    brasileiro.idadePessoa()

    println("\n=== OBJETO FELINO ===")
    val pantera = Felino()
    pantera.locomover()

    println("\n=== OBJETO GATO ===")
    val bichano = Gato()
    bichano.gatoAndando()


}