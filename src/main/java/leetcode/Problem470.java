package leetcode;

import java.util.Random;

@BeatsPercent(98.99)
@TimeComplexity(average = Complexity.CONSTANT, worst = Complexity.INFINITY)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem470 {
    private static int rand7() {
        return new Random().nextInt(7) + 1;
    }
    
    public int rand10() {
        while (true) {
            // choosing from 7*7 grid
            int first = rand7() + (rand7() - 1)*7;
            if (first <= 40) {
                return 1 + ((first - 1) % 10);
            }
            // got 41-49 above, choosing from 9*7 grid
            int second = (first - 40) + (rand7() - 1)*7;
            if (second <= 60) {
                return 1 + ((second - 1) % 10);
            }
            // got 61-63 above, choosing from 3*7 grid
            int third = (second - 60) + (rand7() - 1)*7;
            if (third <= 20) {
                return 1 + ((third - 1) % 10);
            }
            // got 21 above, repeating the whole process
        }
    }
}
