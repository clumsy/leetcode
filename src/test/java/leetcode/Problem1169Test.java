package leetcode;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1169Test {
    private final Problem1169 solution = new Problem1169();
    
    @Test
    public void example1() {
        String[] transactions = {"alice,20,800,mtv","alice,50,100,beijing"};
        List<String> result = solution.invalidTransactions(transactions);
        assertThat(result.size(), is(transactions.length));
        assertThat(result, hasItems(transactions));
    }
    
    @Test
    public void example2() {
        String[] transactions = {
            "alice,20,800,mtv",
            "alice,50,1200,mtv"
        };
        List<String> result = solution.invalidTransactions(transactions);
        assertThat(result.size(), is(1));
        assertThat(result, hasItems("alice,50,1200,mtv"));
    }
    
    @Test
    public void example3() {
        String[] transactions = {
            "alice,20,800,mtv",
            "bob,50,1200,mtv"
        };
        List<String> result = solution.invalidTransactions(transactions);
        assertThat(result.size(), is(1));
        assertThat(result, hasItems("bob,50,1200,mtv"));
    }
    
    @Test
    public void example4() {
        String[] transactions = {
            "alice,20,800,mtv",
            "bob,50,1200,mtv",
            "alice,20,800,mtv",
            "alice,50,1200,mtv",
            "alice,20,800,mtv",
            "alice,50,100,beijing"
        };
        List<String> result = solution.invalidTransactions(transactions);
        assertThat(result.size(), is(transactions.length));
        assertThat(result, hasItems(transactions));
    }
    
    @Test
    public void example5() {
        String[] transactions = {
            "bob,689,1910,barcelona",
            "alex,696,122,bangkok",
            "bob,832,1726,barcelona",
            "bob,820,596,bangkok",
            "chalicefy,217,669,barcelona",
            "bob,175,221,amsterdam"
        };
        List<String> result = solution.invalidTransactions(transactions);
        assertThat(result.size(), is(3));
        assertThat(result, hasItems("bob,689,1910,barcelona","bob,832,1726,barcelona","bob,820,596,bangkok"));
    }
    
    @Test
    public void example6() {
        String[] transactions = {
            "alex,676,260,bangkok",
            "bob,656,1366,bangkok",
            "alex,393,616,bangkok",
            "bob,820,990,amsterdam",
            "alex,596,1390,amsterdam"
        };
        List<String> result = solution.invalidTransactions(transactions);
        assertThat(result.size(), is(2));
        assertThat(result, hasItems("bob,656,1366,bangkok","alex,596,1390,amsterdam"));
    }
}
