package `20200909_Aula06_Exercicios`.herancaClasseAbstrata

class Gato : Felino() {
    override val cor: String = "amarelo"
    fun gatoAndando() {
        super.locomover()
        println("A cor é $cor")
    }
}