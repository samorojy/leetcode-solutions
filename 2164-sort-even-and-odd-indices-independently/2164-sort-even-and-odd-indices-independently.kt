class Solution {
    fun sortEvenOdd(nums: IntArray): IntArray {
        val oddIndicesList = nums.filterIndexed { index, item -> 
            index % 2 != 0}.sortedDescending()
        val evenIndicesList = nums.filterIndexed { index, item -> 
            index % 2 == 0}.sorted()
        
        // val oddIterator = oddIndicesList.iterator()
        // val evenIterator = evenIndicesList.iterator()
        
        val result = IntArray(nums.size)
        
        for (i in nums.indices) {
            result[i] = if (i % 2 == 0) evenIndicesList[i / 2] else oddIndicesList[i / 2]
        }
        
        // while (oddIterator.hasNext() || evenIterator.hasNext()) {
        //     if(evenIterator.hasNext())
        //     result.add(evenIterator.next())
        //     if(oddIterator.hasNext())
        //     result.add(oddIterator.next())
        // }
        
        return result
    }
}