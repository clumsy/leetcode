package leetcode;

@BeatsPercent(57.06)
@TimeComplexity(Complexity.LINEARITHMIC_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem307 {
    class NumArray {
        int[] nums;
        int[] a;

        public NumArray(int[] nums) {
            this.nums = nums;
            this.a = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                init(i, nums[i]);
            }
        }

        private void init(int index, int val) {
            index++;
            while (index <= nums.length) {
                a[index] += val;
                index += index&(-index);
            }
        }

        public void update(int index, int val) {
            int diff = val - nums[index];
            nums[index] = val;
            index++;
            while (index <= nums.length) {
                a[index] += diff;
                index += index&(-index);
            }
        }

        public int sumRange(int left, int right) {
            return sumTo(right) - sumTo(left - 1);
        }

        private int sumTo(int k) {
            int sum = 0;
            k++;
            while (k > 0) {
                sum += a[k];
                k -= k&(-k);
            }
            return sum;
        }
    }
}
