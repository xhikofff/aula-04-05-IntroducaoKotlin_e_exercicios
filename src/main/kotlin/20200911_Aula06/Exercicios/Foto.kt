package `20200911_Aula06`.Exercicios

class Foto: Imprimivel {
    override var nome: String = "selfie"
    override var tipoDocumento: String = "FOTO"

    override fun imprimir() {
        println("Eu sou uma $nome ($tipoDocumento)")
    }

}