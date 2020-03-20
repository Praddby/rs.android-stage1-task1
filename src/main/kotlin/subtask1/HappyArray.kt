package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray = sadArray.filterIndexed { index, element ->
            (index == 0) || (index == sadArray.size - 1) || (sadArray[index-1] + sadArray[index+1] > element)
        }
        return if (sadArray.size == happyArray.size)
            happyArray.toIntArray()
        else
            convertToHappy(happyArray.toIntArray())
    }
}
