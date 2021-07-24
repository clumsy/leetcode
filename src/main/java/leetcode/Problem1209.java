package leetcode;

@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(97.01)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem1209 {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        char[] stack = s.toCharArray();
        int[] count = new int[n];
        int size = 0;
        for (int i = 0; i < n; i++, size++) {
            stack[size] = stack[i];
            count[size] = size > 0 && stack[size] == stack[size - 1] ? count[size - 1] + 1 : 1;
            if (count[size] == k) {
                size -= k;
            }
        }
        return new String(stack, 0, size);
    }
}
