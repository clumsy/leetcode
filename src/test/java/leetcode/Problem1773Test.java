package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Problem1773Test {
    private final Problem1773 solution = new Problem1773();
    
    @Test
    public void example1() {
        List<List<String>> items =
            Arrays.asList(
                Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone"));
        assert solution.countMatches(items, "color", "silver") == 1;
    }
    
    @Test
    public void example2() {
        List<List<String>> items =
            Arrays.asList(
                Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone"));
        assert solution.countMatches(items, "type", "phone") == 2;
    }
}
