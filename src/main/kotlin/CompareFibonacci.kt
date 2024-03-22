class CompareFibonacci(private var num: Int) {
    init {
        if (num in fibonacci(num)){
            println("O número $num pertence a sequência de Fibonacci")
        } else {
            println("O número $num não pertence a sequência de Fibonacci")
        }
    }

    private fun fibonacci(n: Int): List<Int>{
        val fibList = mutableListOf<Int>()

        var a = 0
        var b = 1
        while (b <= n) {
            fibList.add(b)
            val sum = a + b
            a = b
            b = sum
        }
        return fibList
    }
}