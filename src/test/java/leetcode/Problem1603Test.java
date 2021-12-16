package leetcode;

import org.junit.Test;

public class Problem1603Test {
    private final Problem1603 solution = new Problem1603();
    
    @Test
    public void example1() {
        Problem1603.ParkingSystem parkingSystem = solution.new ParkingSystem(1, 1,  0);
        assert parkingSystem.addCar(1);
        assert parkingSystem.addCar(2);
        assert !parkingSystem.addCar(3);
        assert !parkingSystem.addCar(1);
    }
}
