package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem2079 {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        for (int i = 0, can = capacity; i < plants.length; ++i) {
            ++steps;
            if (plants[i] > can) {
                steps += 2*i;
                can = capacity;
            }
            can -= plants[i];
        }
        return steps;
    }
}
