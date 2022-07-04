class Solution {
    fun sortEvenOdd(nums: IntArray): IntArray {
        val oddIndicesList = nums.filterIndexed { index, item -> index % 2 != 0}.sortedDescending()
        val evenIndicesList = nums.filterIndexed { index, item -> index % 2 == 0}.sorted()
        
        // nums.forEachIndexed { index, item -> 
        //     if (index % 2 == 0) evenIndicesList.add(item) 
        //     else oddIndicesList.add(item)
        // }
        // oddIndicesList.sortDescending()
        // evenIndicesList.sort()
        
        val oddIterator = oddIndicesList.iterator()
        val evenIterator = evenIndicesList.iterator()
        
        val result = mutableListOf<Int>()
        while (oddIterator.hasNext() || evenIterator.hasNext()) {
            if(evenIterator.hasNext())
            result.add(evenIterator.next())
            if(oddIterator.hasNext())
            result.add(oddIterator.next())
        }
        
        return result.toIntArray()
    }
}