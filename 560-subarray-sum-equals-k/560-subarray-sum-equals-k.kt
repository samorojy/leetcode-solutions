class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var desiredCount = 0
        var sum = 0
        val map = mutableMapOf<Int, Int>()
        map[0] = 1
        for (i in nums.indices){
            sum += nums[i]
            desiredCount += map.getOrDefault(sum-k, 0)
            map[sum] = map.getOrDefault(sum, 0) + 1
        }
        return desiredCount
    }
}