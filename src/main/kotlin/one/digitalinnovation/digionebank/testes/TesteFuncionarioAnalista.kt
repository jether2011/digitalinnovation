package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista("João Pedro", "1234567899", 2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}
