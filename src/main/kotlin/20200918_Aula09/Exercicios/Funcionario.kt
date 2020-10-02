package `20200918_Aula09`.Exercicios

class Funcionario (val nome: String, val numeroDeRegistro: Int) {
    override fun equals(other: Any?): Boolean {
        other as Funcionario
        return this.numeroDeRegistro === other.numeroDeRegistro
    }
}