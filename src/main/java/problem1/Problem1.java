package problem1;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        Map<Integer, Integer> ints = new HashMap<>(size, 1f);
        for (int i = 0; i < size; i++) {
            ints.put(nums[i], i);
        }
        for (int i = 0; i < size; i++) {
            Integer j = ints.get(target - nums[i]);
            if (j != null && i != j) {
                return new int[] {i, j};
            }
        }
        return new int[0];
    }
}
