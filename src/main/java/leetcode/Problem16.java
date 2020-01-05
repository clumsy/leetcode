package leetcode;

import java.util.Arrays;

public class Problem16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int estimate = target/3;
        if (nums[0] > estimate) {
            return nums[0] + nums[1] + nums[2];
        }
        if (nums[nums.length - 1] < estimate) {
            return nums[nums.length - 3] + nums[nums.length - 2] + nums[nums.length - 1];
        }
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0, count = nums.length - 2; i < count; i++) {
            int x = nums[i];
            if (i > 0 && x == nums[i - 1]) {
                continue;
            }
            if (x > estimate) {
                int current = x + nums[i + 1] + nums[2];
                if (Math.abs(closestSum - target) > Math.abs(current - target)) {
                    return current;
                } else {
                    return closestSum;
                }
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int y = nums[l];
                int z = nums[r];
                int sum = x + y + z;
                int diff = sum - target;
                if (Math.abs(closestSum - target) > Math.abs(diff)) {
                    closestSum = sum;
                }
                if (diff == 0) {
                    return sum;
                } else if (diff < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return closestSum;
    }
}
