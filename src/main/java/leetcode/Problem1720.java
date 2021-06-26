package leetcode;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT) // output does not count
public class Problem1720 {
    public int[] decode(int[] encoded, int first) {
        int[] original = new int[encoded.length + 1];
        original[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            original[i + 1] = original[i]^encoded[i];
        }
        return original;
    }
}
