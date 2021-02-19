package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Analista

fun main() {

    val joao = Analista("Joao","12312312312",2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
