class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var max = 0
        gain.fold(0) { acc, e -> 
            if (acc + e > max) {
                max = acc + e
            } 
            acc + e
        }
        return max
    }
}