package leetcode;

@BeatsPercent(66.40)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem65 {
    public boolean isNumber(String s) {
        char[] a = s.trim().toCharArray();
        boolean dot_seen = false;
        boolean e_seen = false;
        boolean digit_seen = false;
        for (int i = 0; i < a.length; i++) {
            if ('0' <= a[i] && a[i] <= '9') {
                digit_seen = true;
            } else if (a[i] == '.') {
                if (e_seen || dot_seen) {
                    return false; // no dots after dot and 'e'/'E'
                }
                dot_seen = true;
            } else if (a[i] == 'e' || a[i] == 'E') {
                if (e_seen || !digit_seen) {
                    return false; // there must be only one 'e'/'E' that is followed by a number
                }
                digit_seen = false; // there must be a number after 'e'/'E'
                e_seen = true;
            } else if (a[i] == '-' || a[i] == '+') {
                if (i > 0 && a[i - 1] != 'e' && a[i - 1] != 'E') {
                    return false; // sign is not at the beginning or after 'e'/'E'
                }
            } else {
                return false;
            }
        }
        return digit_seen;
    }
}
