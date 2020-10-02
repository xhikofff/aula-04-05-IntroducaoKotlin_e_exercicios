package `20200911_Aula06`.Exemplos

class SuperHomem : Voador, Andador {
    override fun voar() {
        println("Estou voando como um super-homem")
        voarRapido()
    }

    override fun andar() {
        println("Estou andando como uma pessoa")
        andarRapido()
    }
}