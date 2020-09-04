package `20200904_Aula05_Exercicios`

fun main(){
    var cliente1 = Cliente("Carlos", "Silva")
    var cliente2 = Cliente("João", "Alberto")

    var conta1 = Conta(12345,44.00f,cliente1)
    var conta2 = Conta(67890,445.00f,cliente2)

    conta1.depositar(100.00f)
    conta2.depositar(100.00f)

    conta1.sacar(1000.00f)
    conta2.sacar(98.00f)
}