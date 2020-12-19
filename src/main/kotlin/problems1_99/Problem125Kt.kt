package problems1_99

object Problem125Kt {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        val max = s.length - 1
        var right = max
        while (left != right && left <= max && right >= 0) {
            while (left <= max && !isAlphaNumeric(s[left])) {
                left++
            }
            while (right >= 0 && !isAlphaNumeric(s[right])) {
                right--
            }
            if (left > max && right < 0) {
                return true
            }
            if (s[left].toLowerCase() != s[right].toLowerCase()) {
                return false
            }
            left++
            right--
        }
        return true
    }

    private fun isAlphaNumeric(char: Char): Boolean {
        return char in 'a'..'z' || char in 'A'..'Z' || char in '0'..'9'
    }
}
