package `20200904_Aula05_Exercicios`

fun main() {
    val atletaA = Atleta("Atleta A", 5, 5)
    val atletaB = Atleta("Atleta B", 4, 4)

    val provaAA = Prova(5, 5)
    val provaAB = Prova(4, 4)
    val provaAC = Prova(6, 4)

    val provaBA = Prova(5, 5)
    val provaBB = Prova(4, 4)
    val provaBC = Prova(6, 4)

    println("${atletaA.nome} ${podeRealizar(atletaA,provaAA)} realizar a prova")
    println("${atletaA.nome} ${podeRealizar(atletaA,provaAB)} realizar a prova")
    println("${atletaA.nome} ${podeRealizar(atletaA,provaAC)} realizar a prova")
    println("${atletaB.nome} ${podeRealizar(atletaB,provaBA)} realizar a prova")
    println("${atletaB.nome} ${podeRealizar(atletaB,provaBB)} realizar a prova")
    println("${atletaB.nome} ${podeRealizar(atletaB,provaBC)} realizar a prova")
}