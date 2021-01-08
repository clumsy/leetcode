package leetcode;

public class Problem559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int maxDepth = 0;
        for (Node child : root.children) {
            int childDepth = maxDepth(child);
            if (childDepth > maxDepth) {
                maxDepth = childDepth;
            }
        }
        return maxDepth + 1;
    }
}
