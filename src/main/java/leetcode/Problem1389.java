package leetcode;

import java.util.LinkedList;
import java.util.List;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.DOUBLE_LINKED_LIST)
@BeatsPercent(8.08)
@ToDo("Can do in O(N*log(N)) worst-case time complexity")
@TimeComplexity(worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> answer = new LinkedList<>();
        for (int i = 0; i < nums.length; ++i) {
            answer.add(index[i], nums[i]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
