package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem4Test {

    @Test
    public void differentSize() {
        assertThat(new Problem4().findMedianSortedArrays(new int[] {1, 3}, new int[] {2}), is(2.0));
    }

    @Test
    public void sameSize() {
        assertThat(new Problem4().findMedianSortedArrays(new int[] {1, 3}, new int[] {2, 4}), is(2.5));
    }

    @Test
    public void sortedSameSize() {
        assertThat(new Problem4().findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}), is(2.5));
    }

    @Test
    public void sortedDifferentSize() {
        assertThat(new Problem4().findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4, 5}), is(3.0));
    }

    @Test
    public void firstIsEmpty() {
        assertThat(new Problem4().findMedianSortedArrays(new int[] {}, new int[] {1}), is(1.0));
    }

    @Test
    public void secondIsEmpty() {
        assertThat(new Problem4().findMedianSortedArrays(new int[] {2}, new int[] {}), is(2.0));
    }

    @Test
    public void bothOfSizeOne() {
        assertThat(new Problem4().findMedianSortedArrays(new int[] {1}, new int[] {1}), is(1.0));
    }

    @Test
    public void weird() {
        assertThat(new Problem4().findMedianSortedArrays(new int[] {4}, new int[] {1, 2, 3, 5}), is(3.0));
    }

    @Test
    public void standard() {
        assertThat(new Problem4().findMedianSortedArrays(new int[] {1, 3}, new int[] {2, 4, 5}), is(3.0));
    }

    @Test
    public void big() {
        assertThat(new Problem4().findMedianSortedArrays(new int[] {1, 2, 6, 7, 8}, new int[] {3, 4, 5, 9, 10}), is(5.5));
    }
}
