package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > 0) { // because numbers are sorted, no solution when first number is positive
                break;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (l > i + 1 && nums[l] == nums[l - 1]) {
                    l++;
                    continue;
                }
                if (r < nums.length - 1 && nums[r] == nums[r + 1]) {
                    r--;
                    continue;
                }
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[l++], nums[r]));
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}
