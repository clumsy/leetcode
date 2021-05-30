package leetcode;

import java.util.ArrayList;
import java.util.List;

@BeatsPercent(96.52)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem60 {
    public String getPermutation(int n, int k) {
        int bucket_size = 1;
        List<Integer> nums = new ArrayList<>(9);
        for (int i = 1; i <= n; i++) {
            bucket_size *= i;
            nums.add(i);
        }
        k--; // starting from 1, not 0
        StringBuilder result = new StringBuilder();
        for (int i = 0, left = n; i < n; i++) {
            bucket_size /= left--;
            int index = k/bucket_size;
            result.append(nums.remove(index));
            k -= index*bucket_size;
        }
        return result.toString();
    }
}
