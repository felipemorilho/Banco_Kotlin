package model

open abstract class ContaBancaria (var saldo: Double = 0.00){

    open var conta: Int = 0


    open abstract fun sacar(
        valor: Double
    ) : Double

    open abstract fun depositar(
        valor: Double
    ) : Double

    open fun mostrarDados() : String {
        return "Conta Geral"
    }

    open fun transferir(valor: Double, contaSacar: ContaBancaria, contaDeposito: ContaBancaria){
        contaSacar.sacar(valor)
        contaDeposito.depositar(valor)
    }
}