package problems1_99

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class Problem125TestKt {

    @Test
    fun `Only checks alphanumerics`() {
        assertThat(Problem125Kt.isPalindrome("A man, a plan, a canal: Panama"), `is`(true))
    }

    @Test
    fun `Empty string is palindrome`() {
        assertThat(Problem125Kt.isPalindrome(""), `is`(true))
    }

    @Test
    fun `Detects non palindrome`() {
        assertThat(Problem125Kt.isPalindrome("race a car"), `is`(false))
    }

    @Test
    fun `Detects when only non alphanumerics`() {
        assertThat(Problem125Kt.isPalindrome(".,"), `is`(true))
    }
}
