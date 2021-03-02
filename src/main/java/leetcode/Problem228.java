package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem228 {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        int n = nums.length;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = nums[i];
            while (i < n - 1 && nums[i + 1] <= 1 + nums[i]) {
                i++;
            }
            if (start == nums[i]) {
                result.add(Integer.toString(start));
            } else {
                result.add(start + "->" + nums[i]);
            }
        }
        return result;
    }
}
