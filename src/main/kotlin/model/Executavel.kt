import model.ContaCorrente
import model.ContaPoupanca

fun main() {

    var cc = ContaCorrente(conta = 123)


    cc.depositar(valor = 100.00)
    println(cc.conta)
    println(cc.saldo)
    cc.sacar(valor = 500.0)
    cc.saldo
    println(cc.saldo)

    println("\n\n")
    var cp = ContaPoupanca(conta = 456)

    //cp.conta = 456
    cp.depositar(valor = 1500.00)
    println(cp.conta)
    println(cp.saldo)
    cp.sacar(valor = 50.0)
    cp.saldo
    println(cp.saldo)
    cp.sacar(valor = 2000.0)
    cp.saldo
    println(cp.saldo)

    println(cc.mostrarDados())
    println(cp.mostrarDados())

}