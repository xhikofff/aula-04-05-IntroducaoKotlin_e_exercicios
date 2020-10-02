package `20200918_Aula09`.Exercicios

data class Aluno (val nome: String, val numeroDeAluno: Int) {
    override fun equals(other: Any?): Boolean {
        other as Aluno
        return this.numeroDeAluno === other.numeroDeAluno
    }
}