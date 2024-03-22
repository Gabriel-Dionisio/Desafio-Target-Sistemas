class ReverseString(private var string: String) {

    init {
        println(reverseString(string))
    }

    fun reverseString(str: String): String{
        val length = str.length
        val result = CharArray(length)

        for (i in 0 until length) {
            result[i] = str[length - i - 1]
        }

        return String(result)
    }
}