package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem692Test {
    protected Problem692 solution = new Problem692();

    public static final class Alternative1Test extends Problem692Test {
        {
            this.solution = new Problem692.Alternative1();
        }
    }

    public static final class Alternative2Test extends Problem692Test {
        {
            this.solution = new Problem692.Alternative2();
        }
    }

    @Test
    public void simple() {
        assertThat(solution.topKFrequent(new String[] {"i", "love", "leetcode", "i", "love", "coding"}, 2),
            is(asList("i", "love")));
    }

    @Test
    public void bigger() {
        assertThat(solution.topKFrequent(new String[] {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4),
            is(asList("the", "is", "sunny", "day")));
    }

    @Test
    public void aaa() {
        assertThat(solution.topKFrequent(new String[] {"a", "aa", "aaa"}, 2),
            is(asList("a", "aa")));
    }

    @Test
    public void leetcode() {
        assertThat(solution.topKFrequent(new String[] {"i", "love", "leetcode", "i", "love", "coding"}, 3),
            is(asList("i", "love", "coding")));
    }

    @Test
    public void huge() {
        assertThat(solution.topKFrequent(new String[] {
            "glarko", "zlfiwwb", "nsfspyox", "pwqvwmlgri", "qggx", "qrkgmliewc", "zskaqzwo", "zskaqzwo", "ijy",
            "htpvnmozay", "jqrlad", "ccjel", "qrkgmliewc", "qkjzgws", "fqizrrnmif", "jqrlad", "nbuorw", "qrkgmliewc",
            "htpvnmozay", "nftk", "glarko", "hdemkfr", "axyak", "hdemkfr", "nsfspyox", "nsfspyox", "qrkgmliewc", "nftk",
            "nftk", "ccjel", "qrkgmliewc", "ocgjsu", "ijy", "glarko", "nbuorw", "nsfspyox", "qkjzgws", "qkjzgws",
            "fqizrrnmif", "pwqvwmlgri", "nftk", "qrkgmliewc", "jqrlad", "nftk", "zskaqzwo", "glarko", "nsfspyox",
            "zlfiwwb", "hwlvqgkdbo", "htpvnmozay", "nsfspyox", "zskaqzwo", "htpvnmozay", "zskaqzwo", "nbuorw",
            "qkjzgws", "zlfiwwb", "pwqvwmlgri", "zskaqzwo", "qengse", "glarko", "qkjzgws", "pwqvwmlgri", "fqizrrnmif",
            "nbuorw", "nftk", "ijy", "hdemkfr", "nftk", "qkjzgws", "jqrlad", "nftk", "ccjel", "qggx", "ijy", "qengse",
            "nftk", "htpvnmozay", "qengse", "eonrg", "qengse", "fqizrrnmif", "hwlvqgkdbo", "qengse", "qengse", "qggx",
            "qkjzgws", "qggx", "pwqvwmlgri", "htpvnmozay", "qrkgmliewc", "qengse", "fqizrrnmif", "qkjzgws", "qengse",
            "nftk", "htpvnmozay", "qggx", "zlfiwwb", "bwp", "ocgjsu", "qrkgmliewc", "ccjel", "hdemkfr", "nsfspyox",
            "hdemkfr", "qggx", "zlfiwwb", "nsfspyox", "ijy", "qkjzgws", "fqizrrnmif", "qkjzgws", "qrkgmliewc", "glarko",
            "hdemkfr", "pwqvwmlgri"}, 14),
            is(asList(
                "nftk", "qkjzgws", "qrkgmliewc", "nsfspyox", "qengse", "htpvnmozay", "fqizrrnmif",
                "glarko", "hdemkfr", "pwqvwmlgri", "qggx", "zskaqzwo", "ijy", "zlfiwwb")));
    }
}
