package br.com.digitalhouse.blocoinit_metodos

fun main() {
    //Criação do objeto
    val brasileiro = Pessoa("João","Silva",)
    brasileiro.andar()
    println(brasileiro.criarRG(brasileiro.nome, 1234567890))

    val cachorro = Cachorro("Lulu", 2, "Golden")
    brasileiro.passearCachorro(cachorro)
}