package leetcode;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem492 {
    public int[] constructRectangle(int area) {
        int root = (int) Math.sqrt(area);
        while (area % root != 0) {
            root--;
        }
        return new int[] {area/root, root};
    }
}
