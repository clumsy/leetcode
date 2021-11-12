package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.N_PLUS_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem844 {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int removes;
        while (true) {
            removes = 0;
            while (i >= 0 && (removes > 0 || s.charAt(i) == '#')) {
                removes += s.charAt(i--) == '#' ? 1 : -1;
            }

            removes = 0;
            while (j >= 0 && (removes > 0 || t.charAt(j) == '#')) {
                removes += t.charAt(j--) == '#' ? 1 : -1;
            }

            if (i >= 0 && j >= 0 && s.charAt(i) == t.charAt(j)) {
                i--;
                j--;
            } else {
                return i == -1 && j == - 1;
            }
        }
    }
}
