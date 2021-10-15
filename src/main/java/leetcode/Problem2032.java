package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.EASY)
@BeatsPercent(83.64)
@Algorithms(Algorithm.BIT_MASK)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] present = new int[100 + 1];
        for (int num : nums1) {
            present[num] |= 1; // 001
        }
        for (int num : nums2) {
            present[num] |= 2; // 010
        }
        for (int num : nums3) {
            present[num] |= 4; // 100
        }
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i < present.length; i++) {
            if (present[i] == 3 || // 011
                present[i] == 5 || // 101
                present[i] == 6 || // 110
                present[i] == 7) { // 111
                answer.add(i);
            }
        }
        return answer;
    }
}
