package leetcode;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Asserts {
    public static void assertEquivalent(List<?> actual, List<?> expected) {
        String message = actual.toString() + " != " + expected.toString();
        assertThat(message, actual.containsAll(expected), is(true));
        assertThat(message, expected.containsAll(actual), is(true));
        assertThat(actual.size(), is(expected.size()));
    }
}
