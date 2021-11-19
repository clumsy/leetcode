package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem701Test {
    private final Problem701 solution = new Problem701();

    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(4,2,7,1,3);
        assert Objects.equals(solution.insertIntoBST(root, 5),
            TreeNodes.treeOf(4,2,7,5,1,3));
    }

    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf(40,20,60,10,30,50,70);
        assert Objects.equals(solution.insertIntoBST(root, 25),
            TreeNodes.treeOf(40,20,60,10,30,50,70,null,null,25));
    }

    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(4,2,7,1,3,null,null,null,null,null,null);
        assert Objects.equals(solution.insertIntoBST(root, 5),
            TreeNodes.treeOf(4,2,7,1,3,5));
    }

    @Test
    public void example4() {
        TreeNode root = TreeNodes.treeOf();
        assert Objects.equals(solution.insertIntoBST(root, 5),
            TreeNodes.treeOf(5));
    }
}
