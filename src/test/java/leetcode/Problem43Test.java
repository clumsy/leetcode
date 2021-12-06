package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem43Test {
    private final Problem43 solution = new Problem43();

    @Test
    public void example1() {
        assert Objects.equals(solution.multiply("9133", "0"), "0");
    }

    @Test
    public void example2() {
        assert Objects.equals(solution.multiply("2", "3"), "6");
    }

    @Test
    public void example3() {
        assert Objects.equals(solution.multiply("9", "9"), "81");
    }

    @Test
    public void example4() {
        assert Objects.equals(solution.multiply("123", "456"), "56088");
    }

    @Test
    public void example5() {
        assert Objects.equals(solution.multiply("0", "0"), "0");
    }

    @Test
    public void example6() {
        assert Objects.equals(solution.multiply("123456789", "987654321"), "121932631112635269");
    }

    @Test
    public void example7() {
        assert Objects.equals(solution.multiply("498828660196", "840477629533"), "419254329864656431168468");
    }
}
