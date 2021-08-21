package leetcode;

import leetcode.Problem173.BSTIterator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem173Test {
    private final Problem173 solution = new Problem173();
    
    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(7, 3, 15, null, null, 9, 20);
        BSTIterator iterator = solution.new BSTIterator(tree);
        List<Integer> result = new ArrayList<>();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        assertThat(result, is(Arrays.asList(3,7,9,15,20)));
    }
}
