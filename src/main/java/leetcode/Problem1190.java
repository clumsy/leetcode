package leetcode;

import java.util.Deque;
import java.util.LinkedList;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem1190 {
    public String reverseParentheses(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        int[] pair = new int[n];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] == '(') {
                deque.addFirst(i);
            } else if (a[i] == ')') {
                int j = deque.removeFirst();
                pair[i] = j;
                pair[j] = i;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0, delta = 1; i < n; i += delta) {
            if (a[i] == '(' || a[i] == ')') {
                i = pair[i];
                delta = -delta;
            } else {
                ans.append(a[i]);
            }
        }
        return ans.toString();
    }
}
