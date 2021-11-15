package leetcode;

import java.util.Objects;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem117 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Node node = (Node) o;
            return
                val == node.val &&
                Objects.equals(left, node.left) &&
                Objects.equals(right, node.right) &&
                Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, left, right, next);
        }
        
        @Override
        public String toString() {
            return "[" + val + "]"; 
        }
    }
    
    public Node connect(Node root) {
        Node start = root; // already linked
        while (start != null) {
            Node current = start;
            Node next_start = null;
            Node prev = null;
            while (current != null) { // traverse the linked level and link the nodes below
                if (current.left != null) {
                    if (next_start == null) {
                        next_start = current.left;
                        prev = next_start;
                    } else {
                        prev.next = current.left;
                        prev = prev.next;
                    }
                }
                if (current.right != null) {
                    if (next_start == null) {
                        next_start = current.right;
                        prev = next_start;
                    } else {
                        prev.next = current.right;
                        prev = prev.next;
                    }
                }
                current = current.next;
            }
            start = next_start;
        }
        return root;
    }
}
