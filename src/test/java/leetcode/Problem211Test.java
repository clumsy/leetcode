package leetcode;

import leetcode.Problem211.WordDictionary;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem211Test {
    private final Problem211 solution = new Problem211();
    
    @Test
    public void example1() {
        WordDictionary wordDictionary = solution.new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertThat(wordDictionary.search("pad"), is(false));
        assertThat(wordDictionary.search("bad"), is(true));
        assertThat(wordDictionary.search(".ad"), is(true));
        assertThat(wordDictionary.search("b.."), is(true));
    }
    
    @Test
    public void example2() {
        WordDictionary wordDictionary = solution.new WordDictionary();
        wordDictionary.addWord("a");
        wordDictionary.addWord("a");
        assertThat(wordDictionary.search("."), is(true));
        assertThat(wordDictionary.search("a"), is(true));
        assertThat(wordDictionary.search("aa"), is(false));
        assertThat(wordDictionary.search("a"), is(true));
        assertThat(wordDictionary.search(".a"), is(false));
        assertThat(wordDictionary.search("a."), is(false));
    }
    
    @Test
    public void example3() {
        WordDictionary wordDictionary = solution.new WordDictionary();
        wordDictionary.addWord("at");
        wordDictionary.addWord("and");
        wordDictionary.addWord("add");
        assertThat(wordDictionary.search("a"), is(false));
        assertThat(wordDictionary.search(".at"), is(false));
        wordDictionary.addWord("bat");
        assertThat(wordDictionary.search(".at"), is(true));
        assertThat(wordDictionary.search("an."), is(true));
        assertThat(wordDictionary.search("a.d."), is(false));
        assertThat(wordDictionary.search("b."), is(false));
        assertThat(wordDictionary.search("a.d"), is(true));
        assertThat(wordDictionary.search("."), is(false));
    }
}
