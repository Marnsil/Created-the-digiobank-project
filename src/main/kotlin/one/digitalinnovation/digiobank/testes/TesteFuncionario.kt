package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Funcionario
import one.digitalinnovation.digiobank.Pessoa
import java.math.BigDecimal

fun main(){
    val marcos = Pessoa (nome ="Marcos Antonio", cpf = "123456789")
    println(marcos.nome)
    println(marcos.cpf)

    var joao = Funcionario("Marcos Antonio", cpf = "123456789", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}
