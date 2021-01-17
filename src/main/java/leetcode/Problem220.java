package leetcode;

import java.util.TreeSet;

public class Problem220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k <= 0) {
            return false;
        }
        TreeSet<Integer> lastKElements = new TreeSet<>();
        for (int i = 0, size = nums.length; i < size; i++) {
            int num = nums[i];
            if (t == 0) {
                if (lastKElements.contains(num)) {
                    return true;
                }
            } else {
                Integer lowerOrEqual = lastKElements.floor(num);
                if (lowerOrEqual != null) {
                    int diff = num - lowerOrEqual;
                    if (diff >= 0 && diff <= t) {
                        return true;
                    }
                }
                Integer higherOrEqual = lastKElements.ceiling(num);
                if (higherOrEqual != null) {
                    int diff = higherOrEqual - num;
                    if (diff >= 0 && diff <= t) {
                        return true;
                    }
                }
            }
            if (i >= k) {
                int obsolete = nums[i - k];
                lastKElements.remove(obsolete);
            }
            lastKElements.add(num);
        }
        return false;
    }
}
