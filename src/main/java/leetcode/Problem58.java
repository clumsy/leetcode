package leetcode;

@Beats100Percent
public class Problem58 {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (length > 0) {
                    return length;
                }
            } else {
                length++;
            }
        }
        return length;
    }
}
