class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var l = 0
        var r = numbers.lastIndex
        val ans = IntArray(2)
        while (numbers[l] + numbers[r] != target && l < r) {
            if (numbers[l] + numbers[r] > target) {
                r--
            } else {
                l++
            }
        }
        ans[0] = l + 1
        ans[1] = r + 1
        return ans
    }
}