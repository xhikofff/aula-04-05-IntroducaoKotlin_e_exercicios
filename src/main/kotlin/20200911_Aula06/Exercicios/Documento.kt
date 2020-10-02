package `20200911_Aula06`.Exercicios

class Documento: Imprimivel {
    override var nome: String = "documento word"
    override var tipoDocumento: String = "DOCUMENTO"

    override fun imprimir() {
        println("Eu sou um $nome ($tipoDocumento)")
    }
}