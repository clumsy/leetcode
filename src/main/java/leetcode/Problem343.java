package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.MATH)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LOGARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem343 {
    public int integerBreak(int n) {
        switch (n) {
            case 2: return 1; // 1*1
            case 3: return 2; // 1*2
        }
        int num_3 = n / 3;
        int remainder = n % 3;
        if (remainder == 1) {
            --num_3;
            remainder = 4; // using one 3 to bump the remainder to 4 for the optimal product
        } else if (remainder == 0) {
            remainder = 1;
        }
        return (int) Math.pow(3, num_3) * remainder;
    }
}
