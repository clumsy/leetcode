package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.RECURSION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LOGARITHMIC_N) // where N is the number of elements in the BST
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem700 {
    public TreeNode searchBST(TreeNode root, int val) {
        while (true) {
            if (root == null || root.val == val) {
                return root;
            }
            if (root.val > val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
    }
}
