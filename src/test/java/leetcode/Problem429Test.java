package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem429Test {
    private final Problem429 solution = new Problem429();
    
    @Test
    public void example1() {
        Node tree = new Node(1,
            Arrays.asList(new Node(3, Arrays.asList(new Node(5), new Node(6))),
                    new Node(2), new Node(4)));
        assertThat(solution.levelOrder(tree),
            is(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(3,2,4),
                Arrays.asList(5,6))));
    }
}
