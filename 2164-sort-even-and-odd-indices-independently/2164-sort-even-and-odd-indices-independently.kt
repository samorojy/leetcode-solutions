class Solution {
    fun sortEvenOdd(nums: IntArray): IntArray {
        val oddIndicesList = nums.filterIndexed { index, item -> 
            index % 2 != 0}.sortedDescending()
        val evenIndicesList = nums.filterIndexed { index, item -> 
            index % 2 == 0}.sorted()
        
         val oddIterator = oddIndicesList.iterator()
         val evenIterator = evenIndicesList.iterator()
        
        val result = IntArray(nums.size)
        for (i in nums.indices) {
            result[i] = if (i % 2 == 0) evenIterator.next() else oddIterator.next()
        }
        
        return result
    }
}