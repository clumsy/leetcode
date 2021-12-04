package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.STACK)
@BeatsPercent(99.09)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1249 {
    private static final char TOMBSTONE = '*';

    public String minRemoveToMakeValid(String s) {
        char[] ss = s.toCharArray();
        int[] stack = new int[ss.length];
        int size = 0;
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] == '(') {
                stack[size++] = i;
            } else if (ss[i] == ')') {
                if (size > 0) {
                    size--;
                } else {
                    // these have no pair - not valid
                    ss[i] = TOMBSTONE;
                }
            }
        }
        // these have no pair - not valid
        while (size-- > 0) {
            ss[stack[size]] = TOMBSTONE;
        }
        StringBuilder sb = new StringBuilder(ss.length);
        for (char c : ss) {
            if (c != TOMBSTONE) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
