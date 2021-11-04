package leetcode;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import java.util.List;

public class Asserts {
    public static void assertEquivalent(final List<?> actual, final List<?> expected) {
        assert actual.containsAll(expected);
        assert expected.containsAll(actual);
        assert actual.size() == expected.size();
    }
    
    public static Matcher<Double> within(double value, double epsilon) {
        return new BaseMatcher<Double>() {
            @Override
            public boolean matches(Object o) {
                return Math.abs(value - (double) o) < epsilon;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("(ε=" + epsilon + ")");
            }
        };
    }
}
