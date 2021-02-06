package leetcode;

public class Problem258 {
    public int addDigits(int num) {
        while (num > 9) {
            int next = 0;
            while (num > 0) {
                next += num % 10;
                num /= 10;
            }
            num = next;
        }
        return num;
    }
}
