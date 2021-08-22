package leetcode;

import java.util.HashMap;
import java.util.Map;

@BeatsPercent(31.74)
@TimeComplexity(worst = Complexity.CONSTANT) // ? looks like it's bound by Integer range which is a constant
@SpaceComplexity(worst = Complexity.CONSTANT) // ? same
public class Problem166 {
    public String fractionToDecimal(int num, int den) {
        if (num == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        if (num < 0 != den < 0) {
            result.append('-');
        }
        long numerator = Math.abs((long) num);
        long denominator = Math.abs((long) den);

        result.append(numerator/denominator);
        numerator %= denominator;
        if (numerator != 0) {
            result.append('.');
            numerator *= 10;
        }
        Map<Long, Integer> offsets = new HashMap<>();
        while (numerator > 0) {
            Integer offset = offsets.get(numerator);
            if (offset != null) { // repeating
                result.insert((int) offset, '(');
                result.append(')');
                break;
            }
            offsets.put(numerator, result.length());
            result.append(numerator/denominator);
            numerator %= denominator;
            numerator *= 10;
        }
        return result.toString();
    }
}
