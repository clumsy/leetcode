package leetcode;

import java.util.Stack;

public class Problem85 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int cols = matrix[0].length;
        if (cols == 0) {
            return 0;
        }
        int[] histogram = new int[cols];
        int maximalRectangle = 0;
        for (int row = 0, rows = matrix.length; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == '0') {
                    histogram[col] = 0;
                } else {
                    histogram[col]++;
                }
            }
            maximalRectangle = Math.max(maximalRectangle, maximalRectangle(histogram));
        }
        return maximalRectangle;
    }

    private int maximalRectangle(final int[] histogram) {
        Stack<Integer> stack = new Stack<>();
        int maximumRectangle = 0;
        int i = 0;
        while (i < histogram.length) {
            if (stack.isEmpty() || histogram[i] >= histogram[stack.peek()]) {
                stack.push(i++);
            } else {
                maximumRectangle = Math.max(maximumRectangle,
                    histogram[stack.pop()] * (stack.empty() ? i : i - stack.peek() - 1));
            }
        }
        while (!stack.isEmpty()) {
            maximumRectangle = Math.max(maximumRectangle,
                histogram[stack.pop()] * (stack.empty() ? i : i - stack.peek() - 1));
        }
        return maximumRectangle;
    }
}
