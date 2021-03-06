package leetcode;

import java.util.Arrays;

@BeatsPercent(96.69)
public class Problem179 {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        int i = 0;
        for (int num : nums) {
            strs[i++] = Integer.toString(num);
        }
        Arrays.sort(strs, (first, second) -> {
            String firstPlusSecond = first + second;
            String secondPlusFirst = second + first;
            return secondPlusFirst.compareTo(firstPlusSecond);
        });
        if ("0".equals(strs[0])) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            result.append(str);
        }
        return result.toString();
    }
}
