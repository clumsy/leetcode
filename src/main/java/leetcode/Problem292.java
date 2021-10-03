package leetcode;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.CONSTANT)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem292 {
    public boolean canWinNim(int n) {
        // if there are 4*n sticks, then regardless of our move
        // the opponent will make it 4*(n - 1) all the way to 4 where we lose
        return n % 4 != 0;
    }
}
