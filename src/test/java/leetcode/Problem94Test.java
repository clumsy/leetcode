package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem94Test {
    private final Problem94 solution = new Problem94();

    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(1,null,2,3,null);
        assert Objects.equals(solution.inorderTraversal(root),
            Arrays.asList(1,3,2));
    }

    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(2, 3, null, 1);
        assert Objects.equals(solution.inorderTraversal(root),
            Arrays.asList(1,3,2));
    }

    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(1);
        assert Objects.equals(solution.inorderTraversal(root),
            Arrays.asList(1));
    }
}
