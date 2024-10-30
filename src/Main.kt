data class Nodo<T:Any>(var valor:T, var proximoNodo:Nodo<T>? = null){
    override fun toString(): String {
        return if(proximoNodo != null) "$valor -> $proximoNodo" else "$valor"
    }
}

fun main(){
    val lista = Nodo(1, Nodo(2, Nodo( 3,)))

    println(lista)
}