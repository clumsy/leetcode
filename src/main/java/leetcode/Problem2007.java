package leetcode;

@Difficulty(Level.MEDIUM)
@BeatsPercent(97.93)
@Algorithms(Algorithm.COUNTING_SORT)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem2007 {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if ((n & 1) == 1) {
            return new int[0]; // number of elements has to be even
        }
        int[] count = new int[100000 + 1];
        for (int num : changed) {
            count[num]++;
        }

        int k = 0;
        int[] answer = new int[n/2];
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                if (2*i >= count.length || count[i] > count[2*i]) {
                    return new int[0]; // should have been doubled
                }
                count[2*i] -= count[i];
                while (count[i]-- > 0) {
                    answer[k++] = i;
                }
            }
        }
        return answer;
    }
}
