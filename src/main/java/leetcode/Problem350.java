package leetcode;

import java.util.Arrays;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.MAP)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.N_PLUS_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1000 + 1];
        for (int num : nums1) {
            freq[num]++;
        }
        int[] result = new int[nums1.length];
        int size = 0;
        for (int num : nums2) {
            if (freq[num]-- > 0) {
                result[size++] = num;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
