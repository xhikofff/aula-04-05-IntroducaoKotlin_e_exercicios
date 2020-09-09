package `20200904_Aula05_Exercicios`

class JogadorDeFutebol (var nome: String, var energia: Int, var alegria: Int,
                        var gols: Int, var experiencia: Int) {

    fun fazerGol() {
        energia -= 5
        alegria += 10
        gols += 1
        println("$nome: GOOOOL!")
    }

    fun correr() {
        energia -= 10
        println("$nome: Cansei.")
    }
}