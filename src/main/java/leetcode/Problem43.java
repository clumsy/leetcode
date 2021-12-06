package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(99.04)
@TimeComplexity(worst = Complexity.N_BY_M) // where N is the length of num1, M is the length of num2
@SpaceComplexity(worst = Complexity.N_PLUS_M)
public class Problem43 {
    public String multiply(String num1, String num2) {
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int[] result = new int[n1.length + n2.length];
        // multiplying each pair or digits and updating results in corresponding result positions
        for (int i = n1.length - 1; i >= 0; --i) {
            for (int j = n2.length - 1; j >= 0; --j) {
                int product = (n1[i] - '0')*(n2[j] - '0');
                int pos_1 = i + j;
                int pos_2 = i + j + 1;
                int sum = product + result[pos_2];
                result[pos_1] += sum/10;
                result[pos_2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p : result) {
            if (sb.length() != 0 || p != 0) {
                sb.append(p);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
