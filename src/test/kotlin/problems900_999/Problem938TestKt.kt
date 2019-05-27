package problems900_999

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import problems900_999.Problem938Kt.rangeSumBST
import problems900_999.Problem938Kt.treeOf

class Problem938TestKt {

    @Test
    fun withNull() {
        assertThat<Int>(rangeSumBST(treeOf(10, 5, 15, 3, 7, null, 18)!!, 7, 15), `is`<Int>(32))
    }

    @Test
    fun withAnotherNull() {
        assertThat<Int>(rangeSumBST(treeOf(10, 5, 15, 3, 7, 13, 18, 1, null, 6)!!, 6, 10), `is`<Int>(23))
    }
}