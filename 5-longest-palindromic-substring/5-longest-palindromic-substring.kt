class Solution {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) return ""
        var start = 0
        var end = 0
        for (i in s.indices) {
            var evenPalindrom = expand(s, i, i)
            var oddPalindrom = expand(s, i, i + 1)
            if (Math.max(evenPalindrom, oddPalindrom) > end - start) {
                start = i - (Math.max(evenPalindrom, oddPalindrom) - 1) / 2
                end = i + Math.max(evenPalindrom, oddPalindrom) / 2
            }
        }
        return s.substring(start, end + 1)
    }
    
    private fun expand(s: String, left: Int, right :Int): Int {
        var l = left
        var r = right
        while (l >= 0 && r <= s.lastIndex && s[l] == s[r]) {
            l--       
            r++
        }
        return r - l - 1
    }
}