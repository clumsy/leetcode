package leetcode;

import java.util.LinkedList;
import java.util.List;

public class Problem1104 {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> result = new LinkedList<>();
        while (label > 0) {
            result.add(0, label);
            label /= 2;
        }
        int size = result.size();
        boolean oddIntact = size % 2 == 0;
        for (int i = oddIntact ? 2 : 1, powerOf2 = oddIntact ? 4 : 2; i < size; i += 2, powerOf2 *= 4) {
            result.set(i, 3*powerOf2 - 1 - result.get(i));
        }
        return result;
    }
}
