package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem89 {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        for (int i = 1, power = 2; i < n; i++, power *= 2) {
            int size = result.size();
            for (int j = size - 1; j >= 0; j--) {
                result.add(power + result.get(j));
            }
        }
        return result;
    }
}
