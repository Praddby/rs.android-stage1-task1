package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        return intArrayOf(getMin(input), getMax(input))
    }

    private fun getMin(input: IntArray): Int {
        input.sort()
        return input.copyOfRange(0, input.size-1).sum()
    }

    private fun getMax(input: IntArray): Int {
        input.sortDescending()
        return input.copyOfRange(0, input.size-1).sum()
    }
}
