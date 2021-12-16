package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.FREQUENCY_COUNT)
@BeatsPercent(23.40)
public class Problem1603 {
    class ParkingSystem {
        private final int[] capacity;

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public ParkingSystem(int big, int medium, int small) {
            this.capacity = new int[] {big, medium, small};
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public boolean addCar(int carType) {
            return capacity[carType - 1]-- > 0;
        }
    }
}
