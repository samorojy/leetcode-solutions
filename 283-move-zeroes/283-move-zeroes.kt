class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var lastZeroIndex = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[lastZeroIndex] = nums[i].also{ nums[i] = nums[lastZeroIndex] }
                lastZeroIndex++
            }
        }
    }
}