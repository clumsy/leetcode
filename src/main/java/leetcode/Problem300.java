package leetcode;

@BeatsPercent(89.36)
@Algorithms(Algorithm.FENWICK_TREE)
@TimeComplexity(worst = Complexity.LINEARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem300 {
    static class Fenwick {
        private final int[] tree;

        Fenwick(int size) {
            this.tree = new int[size + 1];
        }

        void update(int pos, int val) {
            pos++;
            while (pos < tree.length) {
                tree[pos] = Math.max(tree[pos], val);
                pos += pos & -pos;
            }
        }

        int query(int pos) {
            pos++;
            int val = 0;
            while (pos > 0) {
                val = Math.max(tree[pos], val);
                pos -= pos & -pos;
            }
            return val;
        }
    }

    public int lengthOfLIS(int[] nums) {
        Fenwick bit = new Fenwick(20001); // [-10000;10000]
        int ans = 0;
        for (int num : nums) {
            int i = num + 10000;
            int current = bit.query(i - 1);
            current++;
            bit.update(i, current);
            ans = Math.max(ans, current);
        }
        return ans;
    }
}
