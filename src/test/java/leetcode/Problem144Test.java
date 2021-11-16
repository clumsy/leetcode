package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem144Test {
    private final Problem144 solution = new Problem144();

    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf();
        assert Objects.equals(solution.preorderTraversal(root),
            Arrays.asList());
    }

    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(1,null,2,3);
        assert Objects.equals(solution.preorderTraversal(root),
            Arrays.asList(1,2,3));
    }

    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(3,1,2);
        assert Objects.equals(solution.preorderTraversal(root),
            Arrays.asList(3,1,2));
    }
}
