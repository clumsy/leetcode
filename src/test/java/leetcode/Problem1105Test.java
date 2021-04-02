package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1105Test {
    private final Problem1105 solution = new Problem1105();
    
    @Test
    public void example1() {
        int[][] books = {{1,1},{2,3},{2,3},{1,1},{1,1},{1,1},{1,2}};
        assertThat(solution.minHeightShelves(books, 4), is(6));
    }
}
