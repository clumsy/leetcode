package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem167 {
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0;
        int hi = numbers.length - 1;
        while (lo < hi) {
            int diff = target - (numbers[lo] + numbers[hi]);
            if (diff == 0) {
                return new int[] {lo + 1, hi + 1};
            }
            if (diff > 0) {
                lo++;
            } else {
                hi--;
            }
        }
        throw new RuntimeException();
    }
}
