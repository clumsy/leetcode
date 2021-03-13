package leetcode;

@BeatsPercent(93.44)
@TimeComplexity(Complexity.LINEAR_N) // N = s.length()
@SpaceComplexity(Complexity.LINEAR_K)
public class Problem1461 {
    public boolean hasAllCodes(String s, int k) {
        int need = 1 << k;
        boolean[] codes = new boolean[need];
        int mask = need - 1;
        int current = 0;
        for (int i = 0, length = s.length(); i < length; i++) {
            current = ((current << 1) & mask) | (s.charAt(i) - '0');
            if (i >= k - 1 && !codes[current]) {
                codes[current] = true;
                need--;
            }
        }
        return need == 0;
    }
}
