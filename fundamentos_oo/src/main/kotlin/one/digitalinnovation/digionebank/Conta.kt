package one.digitalinnovation.digionebank

import java.lang.IllegalArgumentException

class Conta(
    val agencia: String,
    val numero: String
) : Depositavel, Sacavel {
    var saldo: Double = 0.0; private set

    override fun deposito(valor: Double) {
        this.saldo += valor
    }

    override fun saque(valor: Double) {
        if(this.saldo < valor) throw IllegalArgumentException("Não é possível fazer saque de valor maior que saldo!")

        this.saldo -= valor
    }

    override fun toString(): String {
        return """
            Ag:     $agencia
            Cc:     $numero
            Saldo:  $saldo
        """.trimIndent()
    }
}