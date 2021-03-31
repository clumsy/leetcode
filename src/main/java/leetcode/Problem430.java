package leetcode;

import java.util.Objects;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem430 {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
        
        @Override
        public boolean equals(Object other) {
            Node that = (Node) other;
            if (this.val != that.val) {
                return false;
            }
            if (!Objects.equals(this.next, that.next)) {
                return false;
            }
            return Objects.equals(this.child, that.child);
        }
    }
    
    public Node flatten(Node head) {
        Node current = head;
        while (current != null) {
            if (current.child != null) {
                Node tmp = current.child;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                tmp.next = current.next;
                if (current.next != null) {
                    current.next.prev = tmp;
                }
                current.next = current.child;
                current.child.prev = current;
                current.child = null;
            }
            current = current.next;
        }
        return head;
    }
}
