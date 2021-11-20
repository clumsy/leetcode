package leetcode;

import org.junit.Test;

public class Problem528Test {
    
    @Test
    public void example1() {
        int[] w = {1};
        assertOutcome(w);
    }
    
    @Test
    public void example2() {
        int[] w = {1,3};
        assertOutcome(w);
    }
    
    @Test
    public void example3() {
        int[] w = {3,14,1,7};
        assertOutcome(w);
    }
    
    private void assertOutcome(int[] w) {
        double sum = 0;
        for (int weight : w) {
            sum += weight;
        }
        Problem528.Solution solution = new Problem528.Solution(w);
        double size = 500;
        int n = w.length;
        int[] freq = new int[n];
        for (int i = 0; i < size; i++) {
            freq[solution.pickIndex()]++;
        }
        for (int i = 0; i < n; i++) {
            double observed = freq[i] / size;
            double expected = w[i] / sum;
            System.out.println(Math.abs(observed - expected));
            assert Math.abs(observed - expected) < 0.05;
        }
    }
}
