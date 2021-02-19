package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Banco

fun main() {
    val digiOneBank = Banco( "digiOne",12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "banco2")

    println(banco2.info())

    }





