package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Gerente

fun main() {
    val maria = Gerente("Maria","123456123",5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}
