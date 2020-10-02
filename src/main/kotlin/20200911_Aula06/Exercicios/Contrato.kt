package `20200911_Aula06`.Exercicios

class Contrato: Imprimivel {
    override var nome: String = "contrato muito legal"
    override var tipoDocumento: String = "CONTRATO"

    override fun imprimir() {
        println("Sou um $nome ($tipoDocumento)")
    }
}