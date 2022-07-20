class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var result = 0
        var left = 0
        // var right = 0
        var sum = 0
        for (i in nums.indices) {
            sum += nums[i]
            if (sum > i - left  - 1) {
                result = Math.max(result, i - left)
            }
            while (sum <= i - left - 1) {
                sum -= nums[left]
                left++
            }
            
        }
        return result
    }
}