package leetcode;

public class Problem264 {
    public int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int i = 1, two = 0, three = 0, five = 0;
        while (i < n) {
            int next2 = uglyNumbers[two] * 2;
            int next3 = uglyNumbers[three] * 3;
            int next5 = uglyNumbers[five] * 5;
            int next = Math.min(next2, Math.min(next3, next5));
            uglyNumbers[i++] = next;
            if (next2 == next) {
                two++;
            }
            if (next3 == next) {
                three++;
            }
            if (next5 == next) {
                five++;
            }
        }
        return uglyNumbers[n - 1];
    }
}
