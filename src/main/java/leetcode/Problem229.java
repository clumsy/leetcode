package leetcode;

import java.util.ArrayList;
import java.util.List;

@BeatsPercent(99.81)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem229 {
    public List<Integer> majorityElement(int[] nums) {
        int first_value = 0;
        int first_count = 0;
        int second_value = 0;
        int second_count = 0;
        for (int num : nums) {
            if (num == first_value) {
                first_count++;
                continue;
            }
            if (num == second_value) {
                second_count++;
                continue;
            }
            if (first_count == 0) {
                first_value = num;
                first_count = 1;
                continue;
            }
            if (second_count == 0) {
                second_value = num;
                second_count = 1;
                continue;
            }
            --first_count;
            --second_count;
        }
        first_count = 0;
        second_count = 0;
        for (int num : nums) {
            if (num == first_value) {
                first_count++;
            } else if (num == second_value) {
                second_count++;
            }
        }
        int n = nums.length;
        List<Integer> result = new ArrayList<>(2);
        if (first_count > n/3) {
            result.add(first_value);
        }
        if (second_count > n/3) {
            result.add(second_value);
        }
        return result;
    }
}
