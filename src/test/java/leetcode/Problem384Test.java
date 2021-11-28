package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem384Test {
    
    @Test
    public void example1() {
        int[] nums = {1,2,3};
        Problem384.Solution solution = new Problem384().new Solution(nums);
        Map<String, Long> counts = 
            Stream.of(
                solution.shuffle(),
                solution.reset(),
                solution.shuffle())
            .map(Arrays::toString)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        assert counts.size() > 1;
    }
}
