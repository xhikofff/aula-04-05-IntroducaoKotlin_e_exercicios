package `20200904_Aula05_Exercicios`

class Prova(var dificuldade: Int, var energiaNecessaria: Int) {

}

fun podeRealizar(atleta: Atleta, prova: Prova): String {
    if (atleta.nível >= prova.dificuldade && atleta.energia >= prova.energiaNecessaria) {
        return "pode"
    } else {
        return "não pode"
    }
}