package leetcode;

@Beats100Percent
public class Problem134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int overall = 0;
        int left = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            int fuel = gas[i] - cost[i];
            left += fuel;
            if (left < 0) {
                start = i + 1;
                left = 0;
            }
            overall += fuel;
        }
        return overall < 0 ? -1 : start;
    }
}
