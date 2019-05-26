package problems1_99.problem7

object Problem7Kt {
    fun reverse(x: Int): Int {
        var x = x
        var result = 0
        val sign = if (x > 0) 1 else -1
        x = Math.abs(x)
        while (x > 0) {
            try {
                result = Math.addExact(Math.multiplyExact(result, 10), x % 10)
            } catch (e: ArithmeticException) {
                return 0
            }
            x /= 10
        }
        return sign * result
    }
}