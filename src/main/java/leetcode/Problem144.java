package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Problem144 {
    public static class Alternative extends Problem144 {

        @Override
        public List<Integer> preorderTraversal(TreeNode root) {
            if (root == null) {
                return Collections.emptyList();
            }
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            stack.add(root);
            while (!stack.isEmpty()) {
                TreeNode current = stack.pop();
                result.add(current.val);
                if (current.right != null) {
                    stack.add(current.right);
                }
                if (current.left != null) {
                    stack.add(current.left);
                }
            }
            return result;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        return doPreorderTraversal(root, new ArrayList<>());
    }

    private static List<Integer> doPreorderTraversal(TreeNode current, List<Integer> result) {
        if (current == null) {
            return result;
        }
        result.add(current.val);
        if (current.left != null) {
            doPreorderTraversal(current.left, result);
        }
        if (current.right != null) {
            doPreorderTraversal(current.right, result);
        }
        return result;
    }
}
