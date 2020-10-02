package `20200918_Aula09`.Exemplos

fun main() {
    var notebook = Notebook("Dell",3000)
    println(notebook)

    var notebook2 = Notebook("Positivo",2500)
    println(notebook2)

    var notebook3 = Notebook("Positivo",2500)
    println(notebook3)

    println(notebook.equals(notebook2))

    println(notebook2.equals(notebook3))

    var copyNotebook2 = notebook2.copy(preco = 4000)
    println(copyNotebook2)

}