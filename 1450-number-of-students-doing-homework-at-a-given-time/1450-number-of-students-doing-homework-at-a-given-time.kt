class Solution {
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var count = 0
        startTime.forEachIndexed { index, item ->
            if (queryTime in startTime[index]..endTime[index]) {
                count++
            }
        }
        return count
    }
}