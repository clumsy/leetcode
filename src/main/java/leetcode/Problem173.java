package leetcode;

import java.util.Deque;
import java.util.LinkedList;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.IN_ORDER_TRAVERSAL)
@BeatsPercent(99.13)
public class Problem173 {
    class BSTIterator {
        private final Deque<TreeNode> stack = new LinkedList<>();

        @TimeComplexity(worst = Complexity.LINEAR_N, average = Complexity.LINEAR_N) // where N is the number of nodes in the tree
        @SpaceComplexity(worst = Complexity.LINEAR_K) // where K is the height of the tree
        public BSTIterator(TreeNode root) {
            push(root);
        }

        private void push(TreeNode root) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
        }

        @TimeComplexity(worst = Complexity.LINEAR_N, average = Complexity.LINEAR_N) // where N is the number of nodes in the tree
        @SpaceComplexity(Complexity.LINEAR_K) // where K is the height of the tree
        public int next() {
            TreeNode next = stack.pop();
            push(next.right);
            return next.val;
        }


        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(Complexity.LINEAR_K)
        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }
}
