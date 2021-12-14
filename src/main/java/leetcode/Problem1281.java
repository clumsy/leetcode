package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LOGARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1281 {
    public int subtractProductAndSum(int n) {
        return product(n) - sum(n);
    }

    private static int product(int n) {
        int product = 1;
        while (n > 0 && product > 0) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }

    private static int sum(int n) {
        int product = 0;
        while (n > 0) {
            product += n % 10;
            n /= 10;
        }
        return product;
    }
}
