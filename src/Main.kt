data class Nodo<T:Any>(var valor:T, var proximoNodo:Nodo<T>? = null) {
    override fun toString(): String = if (proximoNodo != null) "$valor -> $proximoNodo" else "$valor"
}

class OperacaoLista<T:Any>{
    private var inicio: Nodo<T>? = null
    private var fim: Nodo<T>? = null
    private var tamanho:Int = 0

    override fun toString(): String = if(tamanho == 0) "lista vazia" else "a lista contém $tamanho itens\n${inicio.toString()}"

    fun insereComeco(valor:T):OperacaoLista<T> = apply {
        inicio = Nodo(valor = valor, proximoNodo = inicio)
        if (fim == null) fim = inicio
        tamanho++
    }

    fun insereFim(valor:T):OperacaoLista<T> = apply {
        if(tamanho == 0) return insereComeco(valor)

        val novoNodo = Nodo(valor = valor)
        fim!!.proximoNodo = novoNodo
        fim = novoNodo
        tamanho ++
    }
}

fun main(){
    var lista = OperacaoLista<Int>()

    lista.insereComeco(1).insereComeco(2).insereComeco(3)

    lista.insereFim(1).insereFim(2)
    print(lista)
}