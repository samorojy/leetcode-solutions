class Solution {
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var count = 0
        for (i in startTime.indices) {
            if (queryTime in startTime[i]..endTime[i]) {
                count++
            }
        }
        return count
    }
}