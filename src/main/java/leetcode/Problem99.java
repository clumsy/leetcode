package leetcode;

@BeatsPercent(85.02)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem99 {
    public void recoverTree(TreeNode root) {
        TreeNode current = root;
        TreeNode last = null;
        TreeNode first = null;
        TreeNode second = null; // has to be smaller of the two
        while (current != null) {
            if (current.left == null) {
                if (first != null && current.val < second.val) {
                    second = current;
                } else if (last != null && last.val > current.val) {
                    first = last;
                    second = current;
                }
                last = current;
                current = current.right;
            } else {
                TreeNode prev = current.left;
                while (prev.right != null && prev.right != current) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = current;
                    current = current.left;
                } else {
                    if (first != null && current.val < second.val) {
                        second = current;
                    } else if (last != null && last.val > current.val) {
                        first = last;
                        second = current;
                    }
                    prev.right = null;
                    last = current;
                    current = current.right;
                }
            }
        }
        int tmp = second.val;
        second.val = first.val;
        first.val = tmp;
    }
}
