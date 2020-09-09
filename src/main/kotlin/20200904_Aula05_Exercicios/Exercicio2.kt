package `20200904_Aula05_Exercicios`

fun main() {
    val jogadorA = JogadorDeFutebol("Jogador A", 50, 50, 0, 10)
    val jogadorB = JogadorDeFutebol("Jogador B", 40, 60, 2, 2)

    SessaoDeTreinamento(jogadorA,12)
    SessaoDeTreinamento(jogadorB,8)

    println("${jogadorA.alegria}, ${jogadorA.energia}, ${jogadorA.gols}, ${jogadorA.experiencia}")
    println("${jogadorB.alegria}, ${jogadorB.energia}, ${jogadorB.gols}, ${jogadorB.experiencia}")

}