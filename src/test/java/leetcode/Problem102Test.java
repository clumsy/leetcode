package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem102Test {
    private final Problem102 solution = new Problem102();

    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(3,9,20,null,null,15,7);
        assert Objects.equals(solution.levelOrder(root),
            Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(9,20),
                Arrays.asList(15,7)));
    }

    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(1);
        assert Objects.equals(solution.levelOrder(root),
            Arrays.asList(
                Arrays.asList(1)));
    }

    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf();
        assert Objects.equals(solution.levelOrder(root),
            Arrays.asList());
    }
}
