package problems1_99

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class Problem168TestKt {

    @Test
    fun `Returns header for 1`() {
        assertThat(Problem168Kt.convertToTitle(1), `is`("A"))
    }

    @Test
    fun `Returns header for 2`() {
        assertThat(Problem168Kt.convertToTitle(2), `is`("B"))
    }

    @Test
    fun `Returns header for 3`() {
        assertThat(Problem168Kt.convertToTitle(3), `is`("C"))
    }

    @Test
    fun `Returns header for 26`() {
        assertThat(Problem168Kt.convertToTitle(26), `is`("Z"))
    }

    @Test
    fun `Returns header for 27`() {
        assertThat(Problem168Kt.convertToTitle(27), `is`("AA"))
    }

    @Test
    fun `Returns header for 28`() {
        assertThat(Problem168Kt.convertToTitle(28), `is`("AB"))
    }


    @Test
    fun `Returns header for 52`() {
        assertThat(Problem168Kt.convertToTitle(52), `is`("AZ"))
    }

    @Test
    fun `Returns header for 701`() {
        assertThat(Problem168Kt.convertToTitle(701), `is`("ZY"))
    }

    @Test
    fun `Returns header for 703`() {
        assertThat(Problem168Kt.convertToTitle(703), `is`("AAA"))
    }
}
