class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val s1Map = mutableMapOf<Char, Int>()
        for (c in s1) {
            s1Map[c] = s1Map.getOrDefault(c, 0) + 1
        }
        
        for (i in 0..(s2.length - s1.length)) {
            val s2Map = mutableMapOf<Char, Int>()
            for (c in i..(s1.length + i - 1)) {
                s2Map[s2[c]] = s2Map.getOrDefault(s2[c], 0) + 1
            }
            if (isSimilar(s1Map, s2Map)) return true
        }
        return false
    }
    
    fun isSimilar(firstMap: Map<Char, Int>, secondMap: Map<Char, Int>): Boolean {
        for ((key, value) in firstMap) {
                if (secondMap[key] != value) {
                    return false
                }
        }
        return true
    }
}