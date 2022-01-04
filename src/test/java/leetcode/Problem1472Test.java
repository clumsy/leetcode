package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem1472Test {
    private final Problem1472 solution = new Problem1472();
    
    @Test
    public void example1() {
        Problem1472.BrowserHistory browserHistory = solution.new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        assert Objects.equals(browserHistory.back(1), "facebook.com");
        assert Objects.equals(browserHistory.back(1), "google.com");
        assert Objects.equals(browserHistory.forward(1), "facebook.com");
        browserHistory.visit("linkedin.com");
        assert Objects.equals(browserHistory.forward(2), "linkedin.com");
        assert Objects.equals(browserHistory.back(2), "google.com");
        assert Objects.equals(browserHistory.back(7), "leetcode.com");
    }
}
