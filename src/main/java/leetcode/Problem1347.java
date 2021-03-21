package leetcode;

@BeatsPercent(67.97)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem1347 {
    public int minSteps(String s, String t) {
        int length = s.length();
        int[] sCounts = new int[26];
        int[] tCounts = new int[26];
        for (int i = 0; i < length; i++) {
            sCounts[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < length; i++) {
            tCounts[t.charAt(i) - 'a']++;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            int diff = tCounts[i] - sCounts[i];
            if (diff > 0) {
                result += diff;
            }
        }
        return result;
    }
}
