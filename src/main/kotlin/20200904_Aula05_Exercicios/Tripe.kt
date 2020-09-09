package `20200904_Aula05_Exercicios`

class Tripe(var dobrado: Boolean, var alturaMinima: Int, var alturaMaxima: Int, var alturaAtual: Int) {
    fun definirAltura(novaAltura: Int) {
        alturaAtual = novaAltura
    }

    fun dobrar() {
        if (dobrado) {
            println("O tripé já está dobrado.")
        } else {
            dobrado = true
            println("O tripé foi dobrado.")
        }
    }

    fun desdobrar() {
        if (dobrado) {
            dobrado = false
            println("O tripé foi desdobrado.")
        } else {
            println("O tripé já está desdobrado.")
        }
    }

    fun guardar() {
        alturaAtual = alturaMinima
        dobrado = true
        println("Nova altura: ${alturaAtual}. O tripé foi dobrado e guardado.")
    }

    fun prontoParaGuardar() {
        if ((alturaAtual == alturaMinima) && dobrado) {
            println("Pronto para guardar.")
        } else {
            println("Impossível guardar no momento.")
        }
    }

    fun usar() {
        dobrado = false
        alturaAtual = (alturaMaxima / 2) + 1
        println("Nova altura: ${alturaAtual}. O tripé foi desdobrado e está pronto para uso.")
    }

    fun prontoParaUsar() {
        if (dobrado == false && (alturaAtual == (alturaMaxima / 2) + 1)) {
            println("Pronto para usar")
        } else {
        println("Impossível usar no momento")
        }
    }
}