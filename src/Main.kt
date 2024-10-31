data class Nodo<T:Any>(var valor:T, var proximoNodo:Nodo<T>? = null) {
    override fun toString(): String {
        return if (proximoNodo != null) "$valor -> $proximoNodo" else "$valor"
    }
}

class operacaoLista<T:Any>{
    private var inicio: Nodo<T>? = null
    private var fim: Nodo<T>? = null
    private var tamanho:Int = 0

    override fun toString(): String = if(tamanho == 0) "lista vazia" else "a lista contém $tamanho itens"

    fun insere(valor:T):operacaoLista<T> = apply {
        inicio = Nodo(valor = valor, proximoNodo = inicio)
        if (fim == null) fim = inicio
        tamanho++
    }
}

fun main(){
    val lista = Nodo(1, Nodo(2, Nodo( 3,)))

    println(lista)
}