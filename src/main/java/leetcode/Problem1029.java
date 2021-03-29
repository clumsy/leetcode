package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem1029 {
    public int twoCitySchedCost(int[][] costs) {
        // skipping array shuffle due to the small size (2 to 100)
        int n = costs.length/2;
        int start = 0;
        int end = costs.length - 1;
        while (true) {
            int position = partition(costs, start, end);
            if (position == n) {
                break;
            }
            if (position > n) {
                end = position - 1;
            } else {
                start = position + 1;
            }
        }
        int min = 0;
        for (int i = 0; i < costs.length; i++) {
            if (i >= n) {
                min += costs[i][1];
            } else {
                min += costs[i][0];
            }
        }
        return min;
    }

    private int compare(int[][] costs, int i, int j) {
        return (costs[j][1] - costs[j][0]) - (costs[i][1] - costs[i][0]);
    }

    private void swap(int[][] costs, int i, int j) {
        int[] tmp = costs[i];
        costs[i] = costs[j];
        costs[j] = tmp;
    }

    private int partition(int[][] costs, int start, int end) {
        int middle = start + (end - start)/2;
        swap(costs, middle, end);
        int j = start;
        for (int i = start; i < end; i++) {
            if (compare(costs, i, end) < 0) {
                swap(costs, i, j++);
            }
        }
        swap(costs, j, end);
        return j;
    }
}
