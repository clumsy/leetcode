package leetcode;

import org.junit.Test;

import static org.junit.Assert.fail;

public class Problem470Test {
    private final Problem470 solution = new Problem470();
    
    @Test
    public void example1() {
        int[] counts = new int[10];
        int total = 0;
        while (total < 10_000) {
            int num = solution.rand10() - 1;
            counts[num]++;
            total++;
            for (int i = 1, count = 0; i <= 10; i++) {
                if (counts[i - 1]*1./total - 0.1 <= 0.01) {
                    if (++count == 10) {
                        return;
                    }
                }
            }
        }
        fail("Didn't converge to uniform 0.1 probability value");
    }
}
