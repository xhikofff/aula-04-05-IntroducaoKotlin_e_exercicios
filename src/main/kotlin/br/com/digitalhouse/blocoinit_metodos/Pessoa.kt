package br.com.digitalhouse.blocoinit_metodos

class Pessoa (var nome: String, var sobrenome: String) {
//    init {
//        println("Nome: $nome")
//    }
//    var genero: String = "M"
//    init {
//        println("Gênero: $genero")
//    }

    fun andar() {
        println("$nome está andando.")
    }

    fun criarRG(nome: String, numero: Int) : String {
        return "$nome ($numero)."
    }

    fun passearCachorro(cachorro: Cachorro){
        println("$nome está passeando com ${cachorro.nome}.")
    }
}