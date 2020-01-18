package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0, iMax = nums.length - 3; i < iMax; i++) {
            int numI = nums[i];
            if (i > 0 && numI == nums[i - 1]) {
                continue;
            }
            if (numI + 3*max < target) {
                continue;
            }
            if (4*numI > target) {
                continue;
            }
            for (int j = i + 1, jMax = nums.length - 2; j < jMax; j++) {
                int numJ = nums[j];
                if (j > i + 1 && numJ == nums[j - 1]) {
                    continue;
                }
                int remaining = target - numI;
                if (numJ + 2*max < remaining) {
                    continue;
                }
                if (3*numJ > remaining) {
                    continue;
                }
                int k = j + 1, l = nums.length - 1;
                while (k < l) {
                    int numK = nums[k];
                    int numL = nums[l];
                    int diff = remaining - numJ - numK - numL;
                    if (diff == 0) {
                        result.add(Arrays.asList(numI, numJ, numK, numL));
                        while (k < l && numL == nums[--l]);
                        while (k < l && numK == nums[++k]);
                    } else if (diff > 0) {
                        while (k < l && numK == nums[++k]);
                    } else {
                        while (k < l && numL == nums[--l]);
                    }
                }
            }
        }
        return result;
    }
}
