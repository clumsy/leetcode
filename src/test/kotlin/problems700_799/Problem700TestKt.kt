package problems700_799

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import problems700_799.Problem700Kt.searchBST
import problems700_799.Problem700Kt.treeOf

class Problem700TestKt {

    @Test
    fun simple() {
        assertThat(searchBST(treeOf(4, 2, 7, 1, 3), 2), `is`(treeOf(2, 1, 3)))
    }
}