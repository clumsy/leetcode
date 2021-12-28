package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem921 {
    public int minAddToMakeValid(String s) {
        int balance = 0;
        int need = 0;
        for (char c : s.toCharArray()) {
            if (c == ')' && balance < 1) {
                ++need;
            } else {
                balance += c == '(' ? +1 : -1;
            }
        }
        return need + Math.abs(balance);
    }
}
