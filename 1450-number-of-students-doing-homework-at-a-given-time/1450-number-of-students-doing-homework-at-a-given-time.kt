class Solution {
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var count = 0
        startTime.forEachIndexed { index, item ->
            if (queryTime >= startTime[index] && queryTime <= endTime[index]) {
                count++
            }
        }
        return count
    }
}