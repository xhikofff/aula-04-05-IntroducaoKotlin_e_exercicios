package `20200904_Aula05_Exercicios`

class SessaoDeTreinamento (var jogador: JogadorDeFutebol, val experiencia: Int){
    fun treinarA(jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        print("${jogador.nome}: experiência anterior: ${jogador.experiencia}. ")
        jogador.experiencia += experiencia
        println("${jogador.nome}: nova experiência: ${jogador.experiencia}.\n")
    }

    init {
        treinarA(jogador)
    }
}