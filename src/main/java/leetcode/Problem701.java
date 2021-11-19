package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.RECURSION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LOGARITHMIC_N) // where N is the number of elements in BST
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode current = root;
        while (true) {
            if (current.val < val) {
                if (current.right == null) {
                    current.right = new TreeNode(val);
                    return root;
                }
                current = current.right;
            } else {
                if (current.left == null) {
                    current.left = new TreeNode(val);
                    return root;
                }
                current = current.left;
            }
        }
    }
}
