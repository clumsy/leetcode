package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem95Test {
    private final Problem95 solution = new Problem95();

    @Test
    public void example1() {
        assertThat(solution.generateTrees(3),
            is(Arrays.asList(
                TreeNodes.treeOf(1,null,2,null,3),
                TreeNodes.treeOf(1,null,3,2),
                TreeNodes.treeOf(2,1,3),
                TreeNodes.treeOf(3,1,null,null,2),
                TreeNodes.treeOf(3,2,null,1))));
    }

    @Test
    public void example2() {
        assertThat(solution.generateTrees(1),
            is(Collections.singletonList(
                TreeNodes.treeOf(1))));
    }
}
