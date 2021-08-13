package leetcode;

@BeatsPercent(99.68)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1701 {
    public double averageWaitingTime(int[][] customers) {
        int current_time = 0;
        long wait_time = 0;
        for (int[] customer : customers) {
            current_time = Math.max(current_time, customer[0]) + customer[1];
            wait_time += current_time - customer[0];
        }
        return wait_time*1./customers.length;
    }
}
