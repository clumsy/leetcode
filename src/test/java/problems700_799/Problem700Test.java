package problems700_799;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static problems700_799.Problem700.searchBST;
import static problems700_799.Problem700.treeOf;

public class Problem700Test {

    @Test
    public void simple() {
        assertThat(searchBST(treeOf(4, 2, 7, 1, 3), 2), is(treeOf(2, 1, 3)));
    }
}
