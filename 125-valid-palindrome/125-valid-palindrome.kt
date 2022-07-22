class Solution {
    fun isPalindrome(s: String): Boolean {
        if (s.trim().isEmpty())
            return true
        val alphanumeric = s.replace("[^A-Za-z0-9]".toRegex(), "").toLowerCase()
        if (alphanumeric.isEmpty())
            return true
        for (i in 0..alphanumeric.length / 2) {
            if (alphanumeric[i] != alphanumeric[alphanumeric.length - i - 1])
                return false
        }
        return true
    }
}