package leetcode;

import org.junit.Test;

public class Problem1396Test {
    private static final double EPSILON = 10e-6;

    private final Problem1396 solution = new Problem1396();
    
    @Test
    public void example1() {
        Problem1396.UndergroundSystem undergroundSystem = solution.new UndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        assert undergroundSystem.getAverageTime("Paradise", "Cambridge") - 14 <= EPSILON;
        assert undergroundSystem.getAverageTime("Leyton", "Waterloo") - 11 <= EPSILON;
        undergroundSystem.checkIn(10, "Leyton", 24);
        assert undergroundSystem.getAverageTime("Leyton", "Waterloo") - 11 <= EPSILON;
        undergroundSystem.checkOut(10, "Waterloo", 38);
        assert undergroundSystem.getAverageTime("Leyton", "Waterloo") - 12 <= EPSILON;
    }

    @Test
    public void example2() {
        Problem1396.UndergroundSystem undergroundSystem = solution.new UndergroundSystem();
        undergroundSystem.checkIn(10, "Leyton", 3);
        undergroundSystem.checkOut(10, "Paradise", 8);
        assert undergroundSystem.getAverageTime("Leyton", "Paradise") - 5 <= EPSILON;
        undergroundSystem.checkIn(5, "Leyton", 10);
        undergroundSystem.checkOut(5, "Paradise", 16);
        assert undergroundSystem.getAverageTime("Leyton", "Paradise") - 5.5 <= EPSILON;
        undergroundSystem.checkIn(2, "Leyton", 21);
        undergroundSystem.checkOut(2, "Paradise", 30);
        assert undergroundSystem.getAverageTime("Leyton", "Paradise") - 6.66667 <= EPSILON;
    }
}
