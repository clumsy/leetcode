package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem202 {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        while (n != 1 && visited.add(n)) {
            int next = 0;
            while (n > 0) {
                int digit = n % 10;
                next += digit * digit;
                n /= 10;
            }
            n = next;
        }
        return n == 1;
    }
}
