package one.digitalinnovation.digiobank

import one.digitalinnovation.digiobank.testes.TesteAutenticacao

fun  main() {
    val jose = Cliente(
        nome = "jose da silva",
        cpf = "123.123.123-12"  ,
        clienteTipo = ClienteTipo.pf ,
        senha ="123456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)

}


