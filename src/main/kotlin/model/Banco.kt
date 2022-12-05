package model

class Banco {

    val listaContas = arrayListOf<ContaBancaria>()
    
    val consultaContas: List<ContaBancaria> = listaContas

    fun inserir(novaConta: ContaBancaria){
        listaContas.add(novaConta)
    }

    fun remover(novaConta: ContaBancaria){
        listaContas.remove(novaConta)
    }


    //Dificuldade em fazer essa parte
    //fun procurarConta(conta: Int){
    //   if (conta == )
    //}

}

