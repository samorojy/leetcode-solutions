class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var max = 0
        var left = 0
        var currentSum = 0
        for (right in nums.indices) {
            currentSum += nums[right]
            
            if (right - left + 1 > currentSum + k) {
                currentSum -= nums[left]
                left += 1
            }
            max = if (max > right - left + 1) max else right - left + 1
        }
        return max
    }
}