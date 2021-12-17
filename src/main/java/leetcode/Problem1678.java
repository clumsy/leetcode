package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1678 {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char[] s = command.toCharArray();
        for (int i = 0; i < s.length;) {
            if (s[i] == 'G') {
                sb.append('G');
                i += 1;
            } else if (s[i + 1] == ')') {
                sb.append('o');
                i += 2;
            } else {
                sb.append("al");
                i += 4;
            }
        }
        return sb.toString();
    }
}
