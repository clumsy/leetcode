package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        Set<Integer> set = new HashSet<>(nums.length, 1);
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
