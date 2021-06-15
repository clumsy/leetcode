package leetcode;

import java.util.Objects;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N, best = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT, best = Complexity.CONSTANT)
public class Problem138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
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
                random == null ? node.random == null : Objects.equals(random.val, node.random.val) &&
                next == null ? node.next == null : Objects.equals(next.val, node.next.val);
        }
    }
    
    public Node copyRandomList(Node head) {
        Node cursor = head;

        // adding interweaved nodes
        while (cursor != null) {
            Node next = cursor.next;
            cursor.next = new Node(cursor.val);
            cursor.next.next = next;
            cursor = cursor.next.next;
        }
        cursor = head;

        // constructing deep copy
        while (cursor != null) {
            if (cursor.random != null) {
                cursor.next.random = cursor.random.next;
            }
            cursor = cursor.next.next;
        }

        // reverting changes in the original list
        Node result = new Node(0);
        Node result_cursor = result;
        cursor = head;
        while (cursor != null) {
            result_cursor.next = cursor.next;
            result_cursor = result_cursor.next;
            cursor.next = cursor.next.next;
            cursor = cursor.next;
        }
        result_cursor.next = null;
        return result.next;
    }
}
