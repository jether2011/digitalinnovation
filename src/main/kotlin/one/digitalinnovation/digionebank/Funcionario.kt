package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: BigDecimal,
) : Pessoa(nome, cpf) {
    abstract fun calculoAuxilio();
}