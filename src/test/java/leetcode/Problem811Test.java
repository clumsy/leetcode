package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

public class Problem811Test {
    private final Problem811 solution = new Problem811();
    
    @Test
    public void example1() {
        String[] cpdomains = {"9001 discuss.leetcode.com"};
        assert Objects.equals(solution.subdomainVisits(cpdomains),
            Arrays.asList("9001 com","9001 leetcode.com","9001 discuss.leetcode.com"));
    }
    
    @Test
    public void example2() {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        assert Objects.equals(solution.subdomainVisits(cpdomains),
            Arrays.asList("951 com","900 google.mail.com","5 org","1 intel.mail.com","5 wiki.org","901 mail.com","50 yahoo.com"));
    }
}
