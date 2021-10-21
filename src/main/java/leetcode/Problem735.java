package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

@Difficulty(Level.MEDIUM)
@BeatsPercent(35.82)
@Algorithms(Algorithm.MONOTONIC_STACK)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem735 {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int remains = n;
        Deque<Integer> positive = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (asteroids[i] > 0) {
                positive.push(i);
            } else {
                while (!positive.isEmpty()) {
                    remains--;
                    int diff = asteroids[positive.peek()] + asteroids[i];
                    if (diff == 0) {
                        asteroids[i] = 0;
                        asteroids[positive.remove()] = 0;
                        remains--;
                        break;
                    } else if (diff > 0) {
                        asteroids[i] = 0;
                        break;
                    } else {
                        asteroids[positive.remove()] = 0;
                    }
                }
            }
        }

        int[] ans = new int[remains];
        int i = 0;
        for (int asteroid : asteroids) {
            if (asteroid != 0) {
                ans[i++] = asteroid;
            }
        }
        return ans;
    }
}
