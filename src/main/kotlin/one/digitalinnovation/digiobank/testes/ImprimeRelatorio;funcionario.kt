package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Funcionario

class ImprimeRelatorioFuncionario {

    companion object{
        fun imprime(Funcionario: Funcionario) {
        println(
            Funcionario.toString()
        )
        }

    }

}