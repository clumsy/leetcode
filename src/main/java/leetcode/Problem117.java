package leetcode;

import java.util.Objects;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
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
        Node current = root; // already linked
        while (current != null) {
            Node next = current;
            Node next_head = null;
            Node prev = null;
            while (next != null) { // traverse the linked level and link the nodes below
                if (next.left != null) {
                    if (next_head == null) {
                        next_head = next.left;
                        prev = next_head;
                    } else {
                        prev.next = next.left;
                        prev = prev.next;
                    }
                }
                if (next.right != null) {
                    if (next_head == null) {
                        next_head = next.right;
                        prev = next_head;
                    } else {
                        prev.next = next.right;
                        prev = prev.next;
                    }
                }
                next = next.next;
            }
            current = next_head;
        }
        return root;
    }
}
