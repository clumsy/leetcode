package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem113Test {
    private final Problem113 solution = new Problem113();

    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(5,4,8,11,null,13,4,7,2,null,null,5,1);
        assert Objects.equals(solution.pathSum(root, 22),
            Arrays.asList(
                Arrays.asList(5,8,4,5),
                Arrays.asList(5,4,11,2)));
    }

    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(-2,null,-3);
        assert Objects.equals(solution.pathSum(root, -5),
            Arrays.asList(
                Arrays.asList(-2,-3)));
    }

    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf();
        assert Objects.equals(solution.pathSum(root, 0),
            Arrays.asList());
    }

    @Test
    public void example4() {
        TreeNode root = TreeNodes.treeOf(1,2);
        assert Objects.equals(solution.pathSum(root, 1),
            Arrays.asList());
    }
}
