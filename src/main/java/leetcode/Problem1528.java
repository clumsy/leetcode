package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.CYCLIC_SORT)
@BeatsPercent(99.92)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1528 {
    public String restoreString(String s, int[] indices) {
        char[] ss = s.toCharArray();
        for (int i = 0; i < ss.length; ++i) {
            while (i != indices[i]) {
                char tmp_c = ss[indices[i]];
                ss[indices[i]] = ss[i];
                ss[i] = tmp_c;
                int tmp_i = indices[indices[i]];
                indices[indices[i]] = indices[i];
                indices[i] = tmp_i;
            }
        }
        return new String(ss);
    }
}
