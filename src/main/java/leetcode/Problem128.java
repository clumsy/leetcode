package leetcode;

import java.util.HashMap;
import java.util.Map;

@BeatsPercent(35.07)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem128 {
    public int longestConsecutive(int[] nums) {
        UnionFind uf = new UnionFind(1001);
        for (int num : nums) {
            uf.add(num);
        }
        return uf.max_consecutive_length;
    }

    class UnionFind {
        private final Map<Integer, Integer> parent;
        private final Map<Integer, Integer> size;
        private int max_consecutive_length;

        private UnionFind(int n) {
            this.parent = new HashMap<>(n, 1);
            this.size = new HashMap<>(n, 1);
        }

        private void add(int x) {
            if (parent.containsKey(x)) {
                return;
            }
            parent.put(x, x);
            size.put(x, 1);
            max_consecutive_length = Math.max(max_consecutive_length, 1);
            if (parent.containsKey(x - 1)) {
                union(x, x - 1);
            }
            if (parent.containsKey(x + 1)) {
                union(x, x + 1);
            }
        }

        private int find(int x) {
            int p = parent.get(x);
            if (p != x) {
                parent.put(x, find(p));
            }
            return parent.get(x);
        }

        private void union(int x, int y) {
            int p_x = find(x);
            int p_y = find(y);
            if (p_x != p_y) {
                if (size.get(p_x) >= size.get(p_y)) {
                    parent.put(p_y, p_x);
                    size.put(p_x, size.get(p_x) + size.get(p_y));
                    max_consecutive_length = Math.max(max_consecutive_length, size.get(p_x));
                } else {
                    parent.put(p_x, p_y);
                    size.put(p_y, size.get(p_y) + size.get(p_x));
                    max_consecutive_length = Math.max(max_consecutive_length, size.get(p_y));
                }
            }
        }
    }
}
