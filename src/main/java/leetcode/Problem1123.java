package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LOGARITHMIC_N) // because of recursion
public class Problem1123 {
    int max_depth;
    TreeNode answer;
    
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        traverse(root, 0);
        return answer;
    }

    private int traverse(TreeNode root, int depth) {
        if (root == null) {
            if (depth >= max_depth) {
                max_depth = depth;
            }
            return depth;
        }
        int on_left  = traverse(root.left,  depth + 1);
        int on_right = traverse(root.right, depth + 1);
        if (on_left == max_depth && on_right == max_depth) {
            answer = root;
            return max_depth;
        }
        return Math.max(on_left, on_right);
    }
}
