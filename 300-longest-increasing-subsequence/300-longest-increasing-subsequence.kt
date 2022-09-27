class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
    val dp = IntArray(nums.size)
    var len = 0
    for (x in nums) {
        var i = Arrays.binarySearch(dp, 0, len, x)
        if (i < 0) i = -(i + 1)
        dp[i] = x
        if (i == len) len++
    }
    return len
}
}