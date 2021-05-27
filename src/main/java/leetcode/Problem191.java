package leetcode;

@BeatsPercent(100)
public class Problem191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;
        while (n != 0) {
            ones++;
            n ^= n & -n;
        }
        return ones;
    }
}
