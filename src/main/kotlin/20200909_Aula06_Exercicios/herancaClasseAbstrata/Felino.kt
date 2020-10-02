package `20200909_Aula06_Exercicios`.herancaClasseAbstrata

open class Felino(open val cor: String = "") : Animal() {

    final override fun locomover() {
        for (passos in 0..2) {
            println("O felino está se locomovendo e tem a cor $cor")
            super.locomover()
        }
    }

    override fun come(comida: String): String {
        return comida
    }
}