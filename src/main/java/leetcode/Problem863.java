package leetcode;

import java.util.*;

@BeatsPercent(46.11)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem863 {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> result = new ArrayList<>();
        
        TreeNode[] parent = new TreeNode[500];
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            int size = stack.size();
            while (size-- > 0) {
                TreeNode node = stack.pop();
                if (node.left != null) {
                    parent[node.left.val] = node;
                    stack.push(node.left);
                }
                if (node.right != null) {
                    parent[node.right.val] = node;
                    stack.push(node.right);
                }
            }
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(target);
        boolean[] visited = new boolean[500];
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode node = queue.remove();
                if (K > 0) {
                    if (parent[node.val] != null && !visited[parent[node.val].val]) {
                        queue.add(parent[node.val]);
                    }
                    if (node.left != null && !visited[node.left.val]) {
                        queue.add(node.left);
                    }
                    if (node.right != null && !visited[node.right.val]) {
                        queue.add(node.right);
                    }
                } else {
                    result.add(node.val);
                }
                visited[node.val] = true;
            }
            K--;
        }
        
        return result;
    }
}
