package leetcode;

@BeatsPercent(81.13)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1432 {
    public int maxDiff(int num) {
        String s = Integer.toString(num);
        char[] a = s.toCharArray();
        char[] b = a.clone();
        char old_a = 0;
        char old_b = 0;
        char new_b = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = a[i];
            if (old_a == 0 && x != '9') {
                old_a = x;
            }
            if (x == old_a) {
                a[i] = '9';
            }
            char y = b[i];
            if (old_b == 0 && ((i == 0 && y != '1') || (i > 0 && y > '1'))) {
                new_b = i == 0 ? '1' : '0';
                old_b = y;
            }
            if (y == old_b) {
                b[i] = new_b;
            }
        }
        return Integer.parseInt(new String(a)) - Integer.parseInt(new String(b));
    }
}
