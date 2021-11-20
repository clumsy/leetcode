package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.RECURSION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LOGARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val - p.val) * (root.val - q.val) > 0) {
            root = (p.val < root.val) ? root.left : root.right;
        }
        return root;
    }
}
