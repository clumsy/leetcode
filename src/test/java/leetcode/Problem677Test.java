package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem677Test {

    @Test
    public void simple() {
        Problem677.MapSum mapSum = new Problem677.MapSum();
        mapSum.insert("apple", 3);
        assertThat(mapSum.sum("ap"), is(3));
        mapSum.insert("app", 2);
        assertThat(mapSum.sum("ap"), is(5));
    }
}
