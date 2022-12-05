package model

data class ContaCorrente(override var conta: Int) : ContaBancaria() {

    val taxaOperacao = 0.01

    override fun sacar(valor: Double): Double {
        if((valor*1.01) <= this.saldo){
        val valorTaxa = valor * taxaOperacao
            this.saldo -= valor - valorTaxa
        return this.saldo
        } else {
            println("Saldo insuficiente.")
        }
        return this.saldo
    }

    override fun depositar(valor: Double): Double {
        val valorTaxa = valor * taxaOperacao
        this.saldo += valor - valorTaxa
        return this.saldo
    }

    override fun mostrarDados(): String {
        return "Conta: $conta \n Saldo: $saldo"
    }
}