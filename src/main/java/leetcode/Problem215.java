package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.COUNTING_SORT)
@BeatsPercent(98.59)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem215 {
    private static final int MAX = 10000;

    public int findKthLargest(int[] nums, int k) {
        int[] count = new int[2*MAX + 1];
        for (int num : nums) {
            ++count[num + MAX];
        }
        for (int i = count.length - 1; i >= 0; --i) {
            k -= count[i];
            if (k <= 0) {
                return i - MAX;
            }
        }
        throw new RuntimeException();
    }
}
