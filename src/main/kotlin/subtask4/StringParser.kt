package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val outList: MutableList<String> = mutableListOf()
        inputString.forEachIndexed { index, c ->
            when (c) {
                '<' -> {
                    val str = inputString.substring(index + 1).substringBefore('>')
                    if ( str.contains('<') )
                        outList.add(str + '>' + inputString.substringAfter('>').substringBefore('>'))
                    else
                        outList.add(str)
                }
                '(' -> {
                    val str = inputString.substring(index + 1).substringBefore(')')
                    if ( str.contains('(') )
                        outList.add(str + ')' + inputString.substringAfter(')').substringBefore(')'))
                    else
                        outList.add(str)
                }
                '[' -> {
                    val str = inputString.substring(index + 1).substringBefore(']')
                    if ( str.contains('[') )
                        outList.add(str + ']' + inputString.substringAfter(']').substringBefore(']'))
                    else
                        outList.add(str)
                }
            }
        }
        return outList.toTypedArray()
    }
}
