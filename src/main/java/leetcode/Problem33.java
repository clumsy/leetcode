package leetcode;

public class Problem33 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        return doSearch(target, nums, 0, nums.length - 1);
    }

    private int doSearch(int target, int[] nums, int lo, int hi) {
        int left = nums[lo];
        if (target == left) {
            return lo;
        }
        int right = nums[hi];
        if (target == right) {
            return hi;
        }
        if (hi - lo < 2) {
            return -1;
        }
        int mid = (hi + lo + 1)/2;
        int middle = nums[mid];
        if (target == middle) {
            return mid;
        }
        if (hi - lo < 3) {
            return -1;
        }
        if (middle > left) {
            if (target < middle && target > left) {
                return doSearch(target, nums, lo + 1, mid - 1);
            }
            return doSearch(target, nums, mid + 1, hi - 1);
        }
        if (target > middle && target < right) {
            return doSearch(target, nums, mid + 1, hi - 1);
        }
        return doSearch(target, nums, lo + 1, mid - 1);
    }
}
