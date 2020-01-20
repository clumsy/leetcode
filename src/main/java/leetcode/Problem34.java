package leetcode;

public class Problem34 {
    public int[] searchRange(int[] nums, int target) {
        switch (nums.length) {
            case 1:
                if (nums[0] == target) {
                    return new int[] {0, 0};
                }
            case 0:
                return new int[] {-1, -1};
        }
        int length = nums.length - 1;
        int left = bisect(nums, 0, length, target, true);
        if (nums[left] != target) {
            return new int[] {-1, -1};
        }
        int right = bisect(nums, left, length, target, false);
        return new int[] {left, right};
    }

    private int bisect(int[] nums, int lo, int hi, int target, boolean min) {
        if (hi - lo < 2) {
            if (min) {
                return nums[lo] != target ? hi : lo;
            }
            return nums[hi] != target ? lo : hi;
        }
        int mid = (lo + hi + 1)/2;
        int middle = nums[mid];
        if (min) {
            if (target > middle) {
                return bisect(nums, mid, hi, target, min);
            }
            return bisect(nums, lo, mid, target, min);
        }
        if (target < middle) {
            return bisect(nums, lo, mid, target, min);
        }
        return bisect(nums, mid, hi, target, min);
    }
}
