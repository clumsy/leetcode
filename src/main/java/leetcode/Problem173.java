package leetcode;

import java.util.Deque;
import java.util.LinkedList;

@Algorithms(Algorithm.IN_ORDER_TRAVERSAL)
@BeatsPercent(99.13)
@TimeComplexity(Complexity.LINEAR_N) // where N is the number of nodes in the tree
@SpaceComplexity(Complexity.LINEAR_K) // where K is the height of the tree
public class Problem173 {
    class BSTIterator {
        private final Deque<TreeNode> stack = new LinkedList<>();

        public BSTIterator(TreeNode root) {
            push(root);
        }

        private void push(TreeNode root) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
        }

        public int next() {
            TreeNode next = stack.pop();
            push(next.right);
            return next.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }
}
