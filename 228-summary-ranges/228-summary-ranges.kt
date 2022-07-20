class Solution {    
    fun summaryRanges(nums: IntArray): List<String> {
        if(nums.isEmpty()) return emptyList()
        var localMinimum = nums[0]
        var localMaximum = nums[0]
        var previous = nums[0]
        val answer = mutableListOf<String>()
        for (i in 1 until nums.size){
            if (nums[i] - previous == 1){
                localMaximum = nums[i]
            } else {
                if(localMinimum == localMaximum || localMinimum > localMaximum){
                    answer.add("${localMinimum}")
                }else{
                    answer.add("${localMinimum}->${localMaximum}")
                }
                localMinimum = nums[i]
            }
            previous = nums[i]
        }
        if(localMinimum == localMaximum || localMinimum > localMaximum){
                    answer.add("${localMinimum}")
                }else{
                    answer.add("${localMinimum}->${localMaximum}")
                }
        return answer
    }
}