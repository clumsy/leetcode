package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem105Test {
    private final Problem105 solution = new Problem105();

    @Test
    public void example1() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        assert Objects.equals(solution.buildTree(preorder, inorder),
            TreeNodes.treeOf(3,9,20,null,null,15,7));
    }

    @Test
    public void example2() {
        int[] preorder = {-1};
        int[] inorder = {-1};
        assert Objects.equals(solution.buildTree(preorder, inorder),
            TreeNodes.treeOf(-1));
    }
}
