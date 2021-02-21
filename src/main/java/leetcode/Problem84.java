package leetcode;

import java.util.Stack;

public class Problem84 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int maxArea = 0;
        while (i < heights.length) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int area = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                maxArea = Math.max(area, maxArea);
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}