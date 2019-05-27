package problems900_999.problem938;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static problems900_999.problem938.Problem938.rangeSumBST;
import static problems900_999.problem938.Problem938.treeOf;

public class Problem938Test {

    @Test
    public void withNull() {
        assertThat(rangeSumBST(treeOf(10, 5, 15, 3, 7, null, 18), 7, 15), is(32));
    }

    @Test
    public void withAnotherNull() {
        assertThat(rangeSumBST(treeOf(10, 5, 15, 3, 7, 13, 18, 1, null, 6), 6, 10), is(23));
    }
}
