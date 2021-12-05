package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.STACK)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N) // the stack depth
public class Problem105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode[] stack = new TreeNode[preorder.length];
        int size = 0;
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode current = root;
        for (int pre = 1, in = 0; pre < preorder.length && in < inorder.length; pre++) {
            if (current.val != inorder[in]) {
                current.left = new TreeNode(preorder[pre]);
                stack[size++] = current;
                current = current.left;
            } else {
                ++in; // found current, checking next
                // as long as preorder follows inorder, popping the stack
                while (size > 0 && stack[size - 1].val == inorder[in]) {
                    current = stack[--size];
                    ++in;
                }
                current.right = new TreeNode(preorder[pre]);
                current = current.right;
            }
        }
        return root;
    }
}
