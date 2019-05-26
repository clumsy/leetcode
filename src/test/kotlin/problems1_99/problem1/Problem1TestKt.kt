package problems1_99.problem1

import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.assertThat
import org.junit.Test
import problems1_99.problem1.Problem1Kt.twoSum

class Problem1TestKt {

    @Test
    fun `array = 2,7,11,15 and target = 9`() {
        assertThat(twoSum(intArrayOf(2,7,11,15), 9), equalTo(intArrayOf(0, 1)))
    }
}