package problems700_799;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static problems700_799.Problem701.insertIntoBST;
import static problems700_799.Problem701.treeOf;

public class Problem701Test {

    @Test
    public void simple() {
        assertThat(insertIntoBST(treeOf(4, 2, 7, 1, 3), 5), is(treeOf(4, 2, 7, 5, 1, 3)));
    }
}
