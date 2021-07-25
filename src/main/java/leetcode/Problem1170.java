package leetcode;

@BeatsPercent(90.57)
@TimeComplexity(Complexity.LINEAR_N) // where N = Math.max(queries.length, words.length)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1170 {
    private static final int MAX_LENGTH = 10;

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int n = words.length;
        int[] freq = new int[MAX_LENGTH + 1];
        for (String word : words) {
            freq[freq(word)]++;
        }
        for (int i = 0; i < MAX_LENGTH; i++) { // prefix sum
            freq[i + 1] += freq[i];
        }

        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            ans[i] = freq[MAX_LENGTH] - freq[freq(queries[i])];
        }
        return ans;
    }

    private static int freq(String word) {
        char ch = 'z' + 1;
        int count = 0;
        for (int j = 0; j < word.length(); j++) {
            char c = word.charAt(j);
            if (c < ch) {
                ch = c;
                count = 1;
            } else if (c == ch) {
                count++;
            }
        }
        return count;
    }
}
