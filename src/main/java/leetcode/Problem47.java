package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer, Integer> numberCounters = new HashMap<>(nums.length, 1f);
        for (int num : nums) {
            numberCounters.compute(num, (key, counter) -> {
                if (counter == null) {
                    return 1;
                }
                return counter + 1;
            });
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        permute(current, nums.length, numberCounters, result);
        return result;
    }

    private void permute(List<Integer> current, int length, Map<Integer, Integer> numberCounters, List<List<Integer>> result) {
        if (current.size() == length) {
            result.add(new ArrayList<>(current));
        }
        for (Map.Entry<Integer, Integer> number : numberCounters.entrySet()) {
            if (number.getValue() == 0) {
                continue;
            }
            number.setValue(number.getValue() - 1);
            current.add(number.getKey());
            permute(current, length, numberCounters, result);
            number.setValue(number.getValue() + 1);
            current.remove(current.size() - 1);
        }
    }
}
