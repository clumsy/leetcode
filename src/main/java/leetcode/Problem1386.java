package leetcode;

import java.util.HashMap;
import java.util.Map;

@BeatsPercent(92.04)
@TimeComplexity(Complexity.LINEAR_K) // where K is the number of reservations
@SpaceComplexity(Complexity.LINEAR_K) // where K is the number of reservations
public class Problem1386 {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> seats = new HashMap<>();
        int booked_2_or_3 = (1 << 2) | (1 << 3);
        int booked_4_or_5 = (1 << 4) | (1 << 5);
        int booked_6_or_7 = (1 << 6) | (1 << 7);
        int booked_8_or_9 = (1 << 8) | (1 << 9);
        int ans = 0;
        for (int[] reservation : reservedSeats) {
            int row = reservation[0];
            int seat = reservation[1];
            seats.put(row, seats.getOrDefault(row, 0) | (1 << seat));
        }
        for (int row : seats.keySet()) {
            int mask = seats.get(row);
            if ((mask & (booked_2_or_3 | booked_4_or_5)) == 0 &&
                (mask & (booked_6_or_7 | booked_8_or_9)) == 0) {
                ans += 2;
            } else if ((mask & (booked_2_or_3 | booked_4_or_5)) == 0 || 
                       (mask & (booked_4_or_5 | booked_6_or_7)) == 0 ||
                       (mask & (booked_6_or_7 | booked_8_or_9)) == 0) {
                ans += 1;
            }
        }
        ans += 2*(n - seats.size()); // full rows without any reservation
        return ans;
    }
}
