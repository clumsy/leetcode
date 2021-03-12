package leetcode;

@BeatsPercent(65.92)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem557 {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            if (s.charAt(end) != ' ') {
                end++;
            } else {
                int current = end - 1;
                while (current >= start) {
                    result.append(s.charAt(current--));
                }
                result.append(' ');
                start = ++end;
            }
        }
        int current = end - 1;
        while (current >= start) {
            result.append(s.charAt(current--));
        }
        return result.toString();
    }
}
