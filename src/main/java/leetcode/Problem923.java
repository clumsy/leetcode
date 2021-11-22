package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.CONSTRUCT_AROUND_THE_MIDDLE)
@BeatsPercent(76.80)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem923 {
    private static final int MOD = (int) 1e9 + 7;
    private static final int MAX = 100;

    public int threeSumMulti(int[] arr, int target) {
        int answer = 0;
        int[] count_right = new int[MAX + 1];
        for (int num : arr) {
            ++count_right[num];
        }
        int[] count_left = new int[MAX + 1];
        for (int j = 0; j < arr.length - 1; j++) {
            --count_right[arr[j]];
            int remains = target - arr[j];
            if (remains <= 2*MAX) {
                for (int v = 0; v <= Math.min(remains, MAX); v++) {
                    if (remains - v <= MAX) {
                        int count = count_right[v] * count_left[remains - v];
                        if (count > 0) {
                            answer = (answer + count) % MOD;
                        }
                    }
                }
            }
            ++count_left[arr[j]];
        }
        return answer;
    }
}
