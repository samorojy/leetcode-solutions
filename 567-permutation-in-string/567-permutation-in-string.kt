class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        
        if (s1.length > s2.length) return false
        val s1map = IntArray(26)
        val s2map = IntArray(26)
        
        for (i in s1.indices) {
            s1map[s1[i] - 'a']++
            s2map[s2[i] - 'a']++
        }
        
        for (i in 0 until s2.length - s1.length) {
            if (isSimilar(s1map, s2map)) return true
            s2map[s2[i + s1.length] - 'a']++
            s2map[s2[i] - 'a']--
        }
        return isSimilar(s1map, s2map)
    }

    private fun isSimilar(s1map: IntArray, s2map: IntArray): Boolean {
        for (i in 0..25) {
            if (s1map[i] != s2map[i]) return false
        }
        return true
    }
}