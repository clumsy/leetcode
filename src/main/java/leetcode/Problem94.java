package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null) {
            if (root.left != null) {
                stack.push(root);
                root = root.left;
                continue;
            }
            result.add(root.val);
            if (root.right != null) {
                root = root.right;
            } else {
                while (true) {
                    if (stack.isEmpty()) {
                        return result;
                    }
                    root = stack.pop();
                    result.add(root.val);
                    if (root.right != null) {
                        root = root.right;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
