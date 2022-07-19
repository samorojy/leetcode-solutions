class Solution {
    fun maxDistToClosest(seats: IntArray): Int {
        var left = -1
        var right = 0
        var result = 0
        for (i in seats.indices) {
            if (seats[i] == 1) {
                left = i
            } else {
                while (right < seats.size && seats[right] == 0 || right < i) {
                    right++
                }
                var leftFreeSeats = if (left == -1) seats.size else i - left
                var rightFreeSeats = if (right == seats.size) right else right - i
                result = Math.max(result, Math.min(leftFreeSeats, rightFreeSeats))
            }
        }
        return result
    }
}