package leetcode;

import lombok.Data;

public class Problem654 {

    @Data
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    private static TreeNode constructMaximumBinaryTree(int[] nums, int left, int right) {
        if (right - left <= 0) {
            return new TreeNode(nums[left]);
        }
        int pos = left;
        int max = nums[left];
        for (int i = left + 1; i <= right; i++) {
            int cur = nums[i];
            if (max < cur) {
                max = cur;
                pos = i;
            }
        }
        TreeNode result = new TreeNode(max);
        if (pos - left > 0) {
            result.left = constructMaximumBinaryTree(nums, left, pos - 1);
        }
        if (right - pos > 0) {
            result.right = constructMaximumBinaryTree(nums, pos + 1, right);
        }
        return result;
    }
}
