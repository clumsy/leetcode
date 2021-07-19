package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem374Test {
    
    @Test
    public void example1() {
        int pick = 6;
        assertThat(solution(pick).guessNumber(10), is(pick));
    }

    @Test
    public void example2() {
        int pick = 1;
        assertThat(solution(pick).guessNumber(1), is(pick));
    }

    @Test
    public void example3() {
        int pick = 1;
        assertThat(solution(pick).guessNumber(2), is(pick));
    }

    @Test
    public void example4() {
        int pick = 2;
        assertThat(solution(pick).guessNumber(2), is(pick));
    }

    private static Problem374 solution(int pick) {
        return new Problem374() {
            protected int guess(int i) {
                return pick - i;
            }
        };
    }
}
