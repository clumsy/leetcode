package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberWithIndex = new HashMap<>();
        for (int i = 0, length = nums.length; i < length; i++) {
            int num = nums[i];
            int otherNumber = target - num;
            Integer otherNumberIndex = numberWithIndex.get(otherNumber);
            if (otherNumberIndex != null) {
                return new int[] {otherNumberIndex, i};
            }
            numberWithIndex.put(num, i);
        }
        throw new IllegalArgumentException();
    }
}
