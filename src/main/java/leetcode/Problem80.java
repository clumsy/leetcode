package leetcode;

@BeatsPercent(100)
public class Problem80 {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        for (int fast = 2; fast < nums.length; fast++) {
            int next = nums[fast];
            if (next == nums[slow] && next == nums[slow - 1]) {
                continue;
            }
            nums[++slow] = next;
        }
        return slow + 1;
    }
}
