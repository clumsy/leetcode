package leetcode;

import java.util.Arrays;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.UNION_FIND)
@BeatsPercent(99.41)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem947 {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        int[] rows = new int[10000];
        Arrays.fill(rows, Integer.MAX_VALUE);
        int[] cols = new int[10000];
        Arrays.fill(cols, Integer.MAX_VALUE);
        UnionFind uf = new UnionFind(n);
        int i = 0;
        for (int[] stone : stones) {
            int component_1 = Math.min(i, rows[stone[0]]);
            uf.union(i, component_1);
            int component_2 = Math.min(i, cols[stone[1]]);
            uf.union(i, component_2);
            rows[stone[0]] = cols[stone[1]] = uf.find(i);
            i++;
        }
        return n - uf.components;
    }

    private static class UnionFind {
        private final int[] parents;
        private final int[] sizes;
        private int components;

        private UnionFind(int size) {
            this.components = size;
            this.parents = new int[size];
            for (int i = 0; i < size; i++) {
                parents[i] = i;
            }
            this.sizes = new int[size];
            Arrays.fill(sizes, 1);
        }

        private int find(int val) {
            if (val == parents[val]) {
                return val;
            }
            return parents[val] = find(parents[val]);
        }

        private void union(int first, int second) {
            int first_parent = find(first);
            int second_parent = find(second);
            if (first_parent != second_parent) {
                if (sizes[second_parent] > sizes[first_parent]) {
                    int tmp = first_parent;
                    first_parent = second_parent;
                    second_parent = tmp;
                }
                sizes[first_parent] += sizes[second_parent];
                parents[second_parent] = first_parent;
                components--;
            }
        }
    }
}
