package leetcode;

import org.junit.Test;

public class Problem2079Test {
    private final Problem2079 solution = new Problem2079();
    
    @Test
    public void example1() {
        int[] plants = {2,2,3,3};
        assert solution.wateringPlants(plants, 5) == 14;
    }
    
    @Test
    public void example2() {
        int[] plants = {1,1,1,4,2,3};
        assert solution.wateringPlants(plants, 4) == 30;
    }
    
    @Test
    public void example3() {
        int[] plants = {7,7,7,7,7,7,7};
        assert solution.wateringPlants(plants, 8) == 49;
    }
}
