package leetcode;

@Algorithms(Algorithm.DEPTH_FIRST_SEARCH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem988 {
    public String smallestFromLeaf(TreeNode root) {
        return dfs(root, new StringBuilder());
    }

    private String dfs(TreeNode current, StringBuilder builder) {
        builder.append((char) ('a' + current.val));
        if (current.left == null && current.right == null) {
            return new StringBuilder(builder).reverse().toString();
        }
        if (current.left == null) {
            return dfs(current.right, builder);
        }
        if (current.right == null) {
            return dfs(current.left,  builder);
        }
        int length = builder.length();
        String left  = dfs(current.left,  builder);
        builder.setLength(length);
        String right = dfs(current.right, builder);
        return left.compareTo(right) < 0 ? left : right;
    }
}
