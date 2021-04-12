package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N) // where N = |s| + |t|
@SpaceComplexity(Complexity.CONSTANT)
public class Problem844 {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        while (true) {
            int k = 0;
            while (i >= 0 && s.charAt(i) == '#') {
                while (i >= 0 && s.charAt(i) == '#') {
                    i--;
                    k++;
                }
                while (k > 0 && i >= 0 && s.charAt(i) != '#') {
                    k--;
                    i--;
                }
            }
            
            int p = 0;
            while (j >= 0 && t.charAt(j) == '#') {
                while (j >= 0 && t.charAt(j) == '#') {
                    j--;
                    p++;
                }
                while (p > 0 && j >= 0 && t.charAt(j) != '#') {
                    p--;
                    j--;
                }
            }

            if (i < 0 && j < 0) {
                return true;
            }
            if (i < 0 || j < 0) {
                return false;
            }
            if (s.charAt(i--) != t.charAt(j--)) {
                return false;
            }
        }
    }
}
