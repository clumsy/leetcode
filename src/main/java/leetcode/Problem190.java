package leetcode;

@BeatsPercent(100)
public class Problem190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        int k = 0;
        while (k < 32) {
            if ((n & (1 << k)) != 0) {
                result |= 1 << (31 - k);
            }
            k++;
        }
        return result;
    }
}
