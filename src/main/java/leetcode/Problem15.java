package leetcode;

import java.util.*;

public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0, count = nums.length - 2; i < count; i++) {
            int x = nums[i];
            if (i > 0 && x == nums[i - 1]) {
                continue;
            }
            if (x > 0) {
                break;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int y = nums[l];
                int z = nums[r];
                int sum = x + y + z;
                if (sum == 0) {
                    result.add(Arrays.asList(x, y, z));
                    while (l < r && nums[l + 1] == y) {
                        l++;
                    }
                    l++;
                    while (l < r && nums[r - 1] == z) {
                        r--;
                    }
                    r--;
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
