package leetcode;

import java.util.*;

public class Problem103 {
    public static final class Alternative1 extends Problem103 {

        @Override
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            if (root == null) {
                return Collections.emptyList();
            }
            List<List<Integer>> result = new ArrayList<>();
            Deque<TreeNode> queue, next = new ArrayDeque<>();
            next.offer(root);
            boolean goRight = true;
            while (!next.isEmpty()) {
                queue = next;
                next = new ArrayDeque<>();
                LinkedList<Integer> resultItem = new LinkedList<>();
                while (!queue.isEmpty()) {
                    if (goRight) {
                        TreeNode current = queue.removeFirst();
                        resultItem.addLast(current.val);
                        if (current.left != null) {
                            next.addLast(current.left);
                        }
                        if (current.right != null) {
                            next.addLast(current.right);
                        }
                    } else {
                        TreeNode current = queue.removeLast();
                        resultItem.addLast(current.val);
                        if (current.right != null) {
                            next.addFirst(current.right);
                        }
                        if (current.left != null) {
                            next.addFirst(current.left);
                        }
                    }
                }
                result.add(resultItem);
                goRight = !goRight;
            }
            return result;
        }
    }

    public static final class Alternative2 extends Problem103 {

        @Override
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            if (root == null) {
                return Collections.emptyList();
            }
            List<List<Integer>> result = new ArrayList<>();
            LinkedList<Integer> resultItem = new LinkedList<>();
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            queue.offer(null);
            boolean goRight = false;
            while (!queue.isEmpty()) {
                TreeNode current = queue.removeFirst();
                if (current != null) {
                    if (goRight) {
                        resultItem.addFirst(current.val);
                    } else {
                        resultItem.addLast(current.val);
                    }
                    if (current.left != null) {
                        queue.addLast(current.left);
                    }
                    if (current.right != null) {
                        queue.addLast(current.right);
                    }
                } else {
                    result.add(resultItem);
                    resultItem = new LinkedList<>();
                    if (!queue.isEmpty()) {
                        queue.addLast(null);
                    }
                    goRight = !goRight;
                }
            }
            return result;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        insert(root, 0, result);
        return result;
    }

    private static void insert(TreeNode current, int level, List<List<Integer>> result) {
        if (level >= result.size()) {
            LinkedList<Integer> nextLevel = new LinkedList<>();
            nextLevel.add(current.val);
            result.add(nextLevel);
        } else {
            if (level % 2 == 0) {
                result.get(level).add(current.val);
            } else {
                result.get(level).add(0, current.val);
            }
        }
        if (current.left != null) {
            insert(current.left, level + 1, result);
        }
        if (current.right != null) {
            insert(current.right, level + 1, result);
        }
    }
}
