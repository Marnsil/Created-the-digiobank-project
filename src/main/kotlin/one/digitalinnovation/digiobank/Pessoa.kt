package one.digitalinnovation.digiobank

class Pessoa {
    var nome:String = "marcos"
    var cpf:String = "123.123.123-01"
    private set
}
fun main() {
   val marcos = Pessoa ()

    println(marcos)
    println(marcos.nome)
    println(marcos.cpf)

}