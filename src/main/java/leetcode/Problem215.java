package leetcode;

import java.util.PriorityQueue;

public class Problem215 {
    public static class Alternative extends Problem215 {

        @Override
        public int findKthLargest(int[] nums, int k) {
            int index = kthSmallestIndex(nums, 0, nums.length - 1, nums.length - k + 1);
            return nums[index];
        }

        private int kthSmallestIndex(int[] nums, int lo, int hi, int k) {
            int i = lo, j = hi, pivot = nums[hi];
            while (i < j) {
                if (nums[i++] > pivot) {
                    swap(nums, --i, --j);
                }
            }
            swap(nums, i, hi);
            int lessThanPivot = i - lo + 1;
            if (lessThanPivot == k) {
                return i;
            }
            if (lessThanPivot > k) {
                return kthSmallestIndex(nums, lo, i - 1, k);
            }
            return kthSmallestIndex(nums, i + 1, hi, k - lessThanPivot);
        }

        private void swap(int[] nums, int i, int j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int i : nums) {
            minHeap.offer(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
