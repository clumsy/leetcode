package leetcode;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left  = lowestCommonAncestor(root.left,  p, q); // p or q on the left
        TreeNode right = lowestCommonAncestor(root.right, p, q); // p or q on the right
        
        // returning the first node to have both p and q on the left or right
        return left == null ? right : right == null ? left : root; // root if either side, otherwise left or right
    }
}
