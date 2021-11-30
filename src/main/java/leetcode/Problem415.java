package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(92.26)
@TimeComplexity(worst = Complexity.LINEAR_N) // where N is length of longest of num1 and num2
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem415 {
    public String addStrings(String num1, String num2) {
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        StringBuilder result = new StringBuilder(Math.max(n1.length, n2.length));
        for (int carry = 0, i1 = n1.length - 1, i2 = n2.length - 1; i1 >= 0 || i2 >= 0 || carry > 0; carry /= 10) {
            if (i1 >= 0) {
                carry += n1[i1--] - '0';
            }
            if (i2 >= 0) {
                carry += n2[i2--] - '0';
            }
            result.append(carry % 10);
        }
        return result.reverse().toString();
    }
}
