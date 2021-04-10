package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem849 {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int left = -1;
        int right = 0;
        int max_distance = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                left = i;
                continue;
            }
            while (right < n && (seats[right] == 0 || right < i)) { // has to be to the right of i and empty
                right++;
            }
            int left_distance  = left == -1 ? Integer.MAX_VALUE : i - left;
            int right_distance = right == n ? Integer.MAX_VALUE : right - i;
            max_distance = Math.max(max_distance, Math.min(left_distance, right_distance));
        }
        return max_distance;
    }
}
