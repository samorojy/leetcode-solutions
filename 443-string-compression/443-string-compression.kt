class Solution {
    fun compress(chars: CharArray): Int {
        var indexAns = 0
        var index = 0
        while (index < chars.size) {
            val currentChar = chars[index]
            var count = 0
            while (index < chars.size && chars[index] == currentChar) {
                index++
                count++
            }
            chars[indexAns++] = currentChar
            if (count != 1) for (c in count.toString()) chars[indexAns++] = c
        }
        return indexAns  
    }
}