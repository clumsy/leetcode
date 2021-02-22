package leetcode;

@Beats100Percent
public class Problem168 {
    public String convertToTitle(int n) {
        if (n == 1) {
            return "A";
        }
        StringBuilder result = new StringBuilder();
        while (--n >= 0) {
            int next = n%26;
            result.append((char)('A' + next));
            n -= next;
            n /= 26;
        }
        return result.reverse().toString();
    }
}
