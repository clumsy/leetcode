package leetcode;

import org.junit.Test;

public class Problem1184Test {
    private final Problem1184 solution = new Problem1184();
    
    @Test
    public void example1() {
        int[] distance = {1,2,3,4};
        assert solution.distanceBetweenBusStops(distance, 0, 1) == 1;
    }
    
    @Test
    public void example2() {
        int[] distance = {1,2,3,4};
        assert solution.distanceBetweenBusStops(distance, 0, 2) == 3;
    }
    
    @Test
    public void example3() {
        int[] distance = {7,10,1,12,11,14,5,0};
        assert solution.distanceBetweenBusStops(distance, 7, 2) == 17;
    }
}
