package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = bill.filterIndexed { index, _ -> index != k }.sum() / 2
        return if (sum == b)
            "Bon Appetit"
        else
            "${b - sum}"
    }
}
