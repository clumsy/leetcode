package leetcode;

import java.util.Arrays;

@Difficulty(Level.MEDIUM)
@BeatsPercent(98.95)
@Algorithms(Algorithm.MONOTONIC_STACK)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem735 {
    public int[] asteroidCollision(int[] asteroids) {
        int size = 0;
        for (int a : asteroids) {
            if (a > 0) {
                asteroids[size++] = a; // a is going right
            } else { // a is negative - going left
                while (size > 0 && asteroids[size - 1] > 0 && asteroids[size - 1] < -a) {
                    size--; // keep deleting smaller asteroids going right
                }
                if (size == 0 || asteroids[size - 1] < 0) { // top of stack is empty or goes left as well - add
                    asteroids[size++] = a;
                } else if (asteroids[size - 1] == -a) { // top of stack is same size, but going right - crash
                    size--;
                }
            }
        }
        return Arrays.copyOf(asteroids, size);
    }
}
