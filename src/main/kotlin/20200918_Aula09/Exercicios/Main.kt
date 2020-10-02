package `20200918_Aula09`.Exercicios

fun main() {

    var pessoa = Pessoa("Dell", 123456789)
    println(pessoa)

    var pessoa2 = Pessoa("Positivo", 123456789)
    println(pessoa2)

    println(pessoa.equals(pessoa2))

    println(pessoa.RG.equals(pessoa2.RG))

    println("\n")

    var coca = Coca(150, 155.55)
    println(coca)

    var coca2 = Coca(150, 55.55)
    println(coca2)

    println(coca.equals(coca2))

    println(coca.tamanho.equals(coca2.tamanho))

    println("\n----------")

    val aluno1 = Aluno("Victória",1)
    val aluno2 = Aluno("Lucas",2)
    val aluno3 = Aluno("Kaio",3)
    val aluno4 = Aluno("Leonardo",4)

    var listaAlunos = mutableListOf<Aluno>(aluno1,aluno2,aluno3,aluno4)

    val aluno5 = Aluno("Stephanie", 4)

    println("Aluno com número do 5 presente na lista? ${listaAlunos.contains(aluno5)}")


    println("\n----------")

    val funcionario1 = Funcionario("Victória",1)
    val funcionario2 = Funcionario("Lucas",2)
    val funcionario3 = Funcionario("Kaio",3)
    val funcionario4 = Funcionario("Leonardo",4)

    var listaFuncionarios = mutableListOf<Funcionario>(funcionario1,funcionario2,funcionario3,funcionario4)

    val funcionario5 = Funcionario("Stephanie", 4)

    println(listaFuncionarios.contains(funcionario5))

}