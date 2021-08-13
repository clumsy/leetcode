package leetcode;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Asserts {
    public static void assertEquivalent(List<?> actual, List<?> expected) {
        String message = actual.toString() + " != " + expected.toString();
        assertThat(message, actual.containsAll(expected), is(true));
        assertThat(message, expected.containsAll(actual), is(true));
        assertThat(message, actual.size(), is(expected.size()));
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
