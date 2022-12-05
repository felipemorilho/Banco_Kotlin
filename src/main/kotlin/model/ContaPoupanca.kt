package model

data class ContaPoupanca(override var conta: Int) : ContaBancaria() {

    var limite = 500.0

    override fun sacar(valor: Double): Double {
        if (valor <= this.saldo) {
            this.saldo -= valor
            return this.saldo
        } else if ((valor - this.saldo) < limite) {
            this.saldo -= valor
            limite -= this.saldo
            return this.saldo
        } else {
            println("Saldo insuficiente.")
        }
        return this.saldo
    }

    override fun depositar(valor: Double): Double {
        this.saldo += valor
        return this.saldo
    }

    override fun mostrarDados(): String {
        return "Conta: $conta \n Saldo: $saldo"
    }
}