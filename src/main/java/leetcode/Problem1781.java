package leetcode;

@BeatsPercent(98.99)
@TimeComplexity(Complexity.QUADRATIC_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem1781 {
    public int beautySum(String s) {
        int n = s.length();
        int beauty = 0;
        for (int i = 0; i < n; i++) {
            int[] counts = new int[26];
            int[] stat = new int[n + 1]; // the number of character with count 0, 1, ..., n
            int max = 1;
            int min = 1;
            for (int j = i; j < n; j++) {
                int current_char = s.charAt(j) - 'a';
                int current_count = counts[current_char]++;
                stat[current_count]--; // current char count is now count + 1, not count
                stat[current_count + 1]++;
                max = Math.max(max, current_count + 1); // max so far or current char's count + 1
                if (stat[min] == 0) {
                    min++; // min so far was for current char, since we only add new characters, it has to be min + 1
                } else {
                    min = Math.min(min, current_count + 1); // min so far or current char's count + 1
                }
                beauty += max - min;
            }
        }
        return beauty;
    }
}
