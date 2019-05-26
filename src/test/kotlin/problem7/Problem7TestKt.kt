package problem7

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import problem7.Problem7Kt.Companion.reverse

internal class Problem7TestKt {

    @Test
    fun `123`() {
        assertThat(reverse(123), `is`(321))
    }

    @Test
    fun `-123`() {
        assertThat(reverse(-123), `is`(-321))
    }

    @Test
    fun `120`() {
        assertThat(reverse(120), `is`(21))
    }

    @Test
    fun `1534236469`() {
        assertThat(reverse(1534236469), `is`(0))
    }
}