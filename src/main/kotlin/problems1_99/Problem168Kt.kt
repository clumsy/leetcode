package problems1_99

object Problem168Kt {
    fun convertToTitle(n: Int): String {
        var remainder = n - 1
        var result = ""
        while (remainder > 26) {
            var current = remainder % 26
            if (current == 0) {
                current = 26
            }
            result = ('A' + current) + result
            remainder -= 26*current;
        }
        return ('A' + remainder) + result
    }
}
