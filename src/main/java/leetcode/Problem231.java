package leetcode;

@BeatsPercent(100)
public class Problem231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        int lastOne = n & -n;
        int lastOneToggled = n ^ lastOne;
        return lastOneToggled == 0;
    }
}
