package leetcode;

import java.util.concurrent.atomic.AtomicInteger;

public class Problem563 {
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        AtomicInteger totalTilt = new AtomicInteger();
        toSum(root, totalTilt);
        return totalTilt.get();
    }

    private int toSum(TreeNode root, AtomicInteger totalTilt) {
        if (root == null) {
            return 0;
        }
        int leftSum = toSum(root.left, totalTilt);
        int rightSum = toSum(root.right, totalTilt);
        int tilt = Math.abs(leftSum - rightSum);
        totalTilt.addAndGet(tilt);
        return root.val + leftSum + rightSum;
    }
}
