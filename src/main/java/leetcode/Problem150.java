package leetcode;

@BeatsPercent(97.60)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem150 {
    public int evalRPN(String[] tokens) {
        int[] values = new int[tokens.length/2 + 1];
        int position = 0;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    values[position - 2] = values[position - 2] + values[position - 1];
                    position--;
                    break;
                case "-":
                    values[position - 2] = values[position - 2] - values[position - 1];
                    position--;
                    break;
                case "/":
                    values[position - 2] = values[position - 2] / values[position - 1];
                    position--;
                    break;
                case "*":
                    values[position - 2] = values[position - 2] * values[position - 1];
                    position--;
                    break;
                default:
                    values[position++] = Integer.parseInt(token);
                    break;
            }
        }
        return values[position - 1];
    }
}
