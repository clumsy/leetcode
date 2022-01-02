package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.CONSTANT)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1641 {
    private static final int VOWEL_COUNT = 5;

    public int countVowelStrings(int n) {
        // there are n + 4 positions (n and 4 "separators")
        // separators designate how my 'a','e','i','o','u we take
        // we need to know how many ways we can place 4 separators over n + 4:
        // (n + 4) n 4
        return (n + 1)*(n + 2)*(n + 3)*(n + 4)/(1*2*3*4);
    }
}
