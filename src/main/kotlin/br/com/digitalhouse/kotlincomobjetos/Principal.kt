package br.com.digitalhouse.kotlincomobjetos

import java.util.*

fun main() {
    //Criação do objeto
    val brasileiro = Pessoa()

    //Exibe informações inicializadas na classe Pessoa
    println("O brasileiro é ${brasileiro.nome} e tem ${brasileiro.idade} anos.")

    //Alteração de propriedades
    brasileiro.nome = "Sérgio"
    brasileiro.idade = 24
    println("O brasileiro é ${brasileiro.nome} e tem ${brasileiro.idade} anos.")

    //propriedade sobrenome definida como val (constante), não pode ser alterada
    brasileiro.nome = "Jessica"
    println("O brasileiro é ${brasileiro.nome} ${brasileiro.sobrenome} e tem ${brasileiro.idade} anos.")


    //-------------------------------

//    val cachorro = Cachorro("Golden",2)
//    println("O nome do cachorro é ${cachorro.nome}.")
//    println("Ele é um ${cachorro.raça} de ${cachorro.idade} anos.")

    val cachorro = Cachorro("Bidu",2,"Golden")
    println("O nome do cachorro é ${cachorro.nome}.")
    println("Ele é um ${cachorro.raça} de ${cachorro.idade} anos.")

    //-------------------------------

    val scanner = Scanner(System.`in`)

    print("Olá, digite seu nome: ")

    var nomeRecebido = scanner.next()

    print("Olá, $nomeRecebido")
}