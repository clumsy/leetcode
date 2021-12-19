package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem1859Test {
    private final Problem1859 solution = new Problem1859();
    
    @Test
    public void example1() {
        assert Objects.equals(solution.sortSentence("is2 sentence4 This1 a3"),
            "This is a sentence");
    }
    
    @Test
    public void example2() {
        assert Objects.equals(solution.sortSentence("Myself2 Me1 I4 and3"),
            "Me Myself and I");
    }
}
