package leetcode;

import java.util.Objects;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.RECURSION)
@BeatsPercent(43.97)
@TimeComplexity(worst = Complexity.QUADRATIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem427 {
    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return val == node.val && isLeaf == node.isLeaf &&
                Objects.equals(topLeft, node.topLeft) &&
                Objects.equals(topRight, node.topRight) &&
                Objects.equals(bottomLeft, node.bottomLeft) &&
                Objects.equals(bottomRight, node.bottomRight);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, isLeaf, topLeft, topRight, bottomLeft, bottomRight);
        }
    };
    
    public Node construct(int[][] grid) {
        for (int r = 0; r < grid.length; ++r) {
            for (int c = 0; c < grid.length; ++c) {
                if (r > 0) {
                    grid[r][c] += grid[r - 1][c];
                }
                if (c > 0) {
                    grid[r][c] += grid[r][c - 1];
                }
                if (r > 0 && c > 0) {
                    grid[r][c] -= grid[r - 1][c - 1];
                }
            }
        }
        return build(grid, 0, 0, grid.length);
    }

    Node build(int[][] grid, int r, int c, int len) {
        int sum = get(grid, r, c, len);
        if (len == 1 || sum == 0 || sum == len*len) {
            return new Node(sum != 0, true);
        }
        Node node = new Node(true, false);
        node.topLeft  = build(grid, r, c, len/2);
        node.topRight = build(grid, r, c + len/2, len/2);
        node.bottomLeft  = build(grid, r + len/2, c, len/2);
        node.bottomRight = build(grid, r + len/2, c + len/2, len/2);
        return node;
    }

    int get(int[][] grid, int r, int c, int len) {
        int val = grid[r + len - 1][c + len - 1];
        if (r > 0) {
            val -= grid[r - 1][c + len - 1];
        }
        if (c > 0) {
            val -= grid[r + len - 1][c - 1];
        }
        if (r > 0 && c > 0) {
            val += grid[r - 1][c - 1];
        }
        return val;
    }
}
