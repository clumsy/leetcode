package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem763Test {
    private final Problem763 solution = new Problem763();
    
    @Test
    public void example1() {
        assert Objects.equals(solution.partitionLabels("ababcbacadefegdehijhklij"),
            Arrays.asList(9,7,8));
    }
    
    @Test
    public void example2() {
        assert Objects.equals(solution.partitionLabels("eccbbbbdec"),
            Arrays.asList(10));
    }
}
