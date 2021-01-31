package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Conta

fun main() {
    val contaJoao = Conta(
        numero = "13444-5",
        agencia = "0857"
    )

    println(contaJoao)

    try {
        contaJoao.saque(10.0)
    } catch (e: Exception) {
        println(e.message)
        contaJoao.deposito(150.0)
    }

    println(contaJoao)
}