class Solution {
    fun isPalindrome(s: String): Boolean {
        if (s.trim().isEmpty())
            return true
        val alphanumeric = s.replace("[^A-Za-z0-9 ]".toRegex(), "")
            .toLowerCase().replace("\\s".toRegex(), "")
        if (alphanumeric.isEmpty())
            return true
        for (i in 0..alphanumeric.length / 2) {
            val start = alphanumeric[i]
            val end = alphanumeric[alphanumeric.length - i - 1]
            if (start != end)
                return false
        }
        return true
    }
}