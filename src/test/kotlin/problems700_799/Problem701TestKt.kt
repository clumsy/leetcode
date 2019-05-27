package problems700_799

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import problems700_799.Problem701Kt.insertIntoBST
import problems700_799.Problem701Kt.treeOf

class Problem701TestKt {

    @Test
    fun simple() {
        assertThat(insertIntoBST(treeOf(4, 2, 7, 1, 3)!!, 5), `is`(treeOf(4, 2, 7, 5, 1, 3)))
    }
}
