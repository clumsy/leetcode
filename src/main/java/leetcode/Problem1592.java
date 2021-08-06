package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1592 {
    public String reorderSpaces(String text) {
        int spaces = 0;
        int words = 0;
        char[] s = text.toCharArray();
        int n = s.length;
        int i = 0;
        while (i < n) {
            while (i < n && s[i] == ' ') {
                spaces++;
                i++;
            }
            if (i < n && s[i] != ' ') {
                words++;
                while (i < n && s[i] != ' ') {
                    i++;
                }
            }
        }
        StringBuilder ans = new StringBuilder(n);
        int gap = words > 1 ? spaces / (words - 1) : 0;
        i = 0;
        while (words-- > 0) {
            while (i < n && s[i] == ' ') {
                i++;
            }
            while (i < n && s[i] != ' ') {
                ans.append(s[i]);
                i++;
            }
            if (words > 0) {
                for (int j = 0; j < gap; j++) {
                    ans.append(' ');
                }
                spaces -= gap;
            }
        }
        while (spaces-- > 0) {
            ans.append(' ');
        }
        return ans.toString();
    }
}
