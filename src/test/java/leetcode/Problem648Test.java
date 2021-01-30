package leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem648Test {
    private final Problem648 solution = new Problem648();

    @Test
    public void example1() {
        assertThat(solution.replaceWords(Arrays.asList("cat", "bat", "rat"), "the cattle was rattled by the battery"),
            is("the cat was rat by the bat"));
    }
}
