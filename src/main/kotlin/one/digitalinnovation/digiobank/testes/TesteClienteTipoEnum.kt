package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
       println("${elemento.name}  e ${elemento.descricao}")
    }
    ClienteTipo.values().forEach {
        println("${it.name}  e ${it.descricao}")
    }
    val pf = ClienteTipo.pf
    println(">>${pf.name}  e ${pf.descricao}")

    val pj = ClienteTipo.pj
    println(">>${pj.name}  e ${pj.descricao}")

}


