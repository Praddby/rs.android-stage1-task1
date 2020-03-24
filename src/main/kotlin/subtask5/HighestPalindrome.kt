package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var count = 1
        val listString: MutableList<String> = digitString.chunked(1) as MutableList<String>
        val maxDigitsList = listString.max()
        digitString.forEachIndexed { index, c ->
            if (count <= k) {
                if (index < n / 2) {
                    val lastIndex = digitString.lastIndex - index
                    if (c != digitString[lastIndex]) {
                        listString[lastIndex] = maxDigitsList.toString()
                        listString[index] = maxDigitsList.toString()
                        count++
                    }
                }
            }
        }
        return if (newString(listString).dropLast(n/2) == newString(listString).drop(n/2).reversed())
            newString(listString)
        else
            "-1"
    }
}

private fun newString(str: MutableList<String>) = buildString {
    for (c in str)
        append(c)
}
