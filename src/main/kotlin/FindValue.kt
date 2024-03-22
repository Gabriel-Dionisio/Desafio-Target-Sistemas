class FindValue {
    val INDICE = 13
    var soma = 0
    var k = 0

    init {
        while (k < INDICE){
            k++
            soma += k
        }

        println("Resultado: $soma")
    }
}