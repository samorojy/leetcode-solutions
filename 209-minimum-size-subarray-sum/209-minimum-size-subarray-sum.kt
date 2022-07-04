class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var maxLength = 0
        var left = 0
        var currentSum = 0
        for (right in nums.indices) {
            currentSum += nums[right]
            
            while (currentSum >= target) {
                if (maxLength == 0 || maxLength > right - left + 1) 
                    maxLength =  right - left + 1 
                currentSum -= nums[left]
                left += 1
            }
        }
        return maxLength
    }
}