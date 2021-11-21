package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(93.74)
@TimeComplexity(worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0, n = nums.length; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // same as previous, skipping
            }
            if (nums[i] > 0) {
                break; // all 3 are positive
            }
            int k = n - 1;
            int j = i + 1;
            while (j < k) {
                if (nums[k] < 0) {
                    break; // all 3 are negative
                }
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j + 1] == nums[j]) {
                        j++;
                    }
                    j++;
                    while (j < k && nums[k - 1] == nums[k]) {
                        k--;
                    }
                    k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return result;
    }
}
