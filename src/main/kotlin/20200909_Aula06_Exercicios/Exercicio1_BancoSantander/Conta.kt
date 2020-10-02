package `20200909_Aula06_Exercicios`.Exercicio1_BancoSantander

abstract class Conta (val numeroConta: Int, var saldoConta: Float, var titularConta: Cliente ) {

     fun depositar(quantiaDeposito: Float) {
        saldoConta += quantiaDeposito
        println("Foi feito um depósito. Novo saldo na conta $numeroConta: R$ $saldoConta")
    }

     fun sacar(quantiaSaque: Float) {
        if (quantiaSaque > saldoConta) {
            println("Saldo insuficiente na conta $numeroConta.")
        } else {
            saldoConta -= quantiaSaque
            println("Foi feito um saque. Novo saldo na conta $numeroConta: R$ $saldoConta")
        }
    }
}