package leetcode;

import leetcode.Problem208.Trie;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem208Test {
    private final Problem208 solution = new Problem208();

    @Test
    public void example() {
        Trie obj = solution.new Trie();
        obj.insert("apple");
        assertThat(obj.search("apple"), is(true));
        assertThat(obj.search("app"), is(false));
        assertThat(obj.startsWith("app"), is(true));
        obj.insert("app");
        assertThat(obj.search("app"), is(true));
    }
}
