package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DOUBLE_LINKED_LIST)
@BeatsPercent(96.47)
public class Problem707 {
    class MyLinkedList {
        private final class ListNode {
            int val;
            ListNode prev;
            ListNode next;
        }

        private final ListNode head = new ListNode();
        private int size;

        public MyLinkedList() {
            head.next = head;
            head.prev = head;
        }

        @TimeComplexity(worst = Complexity.LINEAR_N)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public int get(int index) {
            ListNode current = head;
            while (current.next != head && index-- > 0) {
                current = current.next;
            }
            return current.next == head ? -1 : current.next.val;
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public void addAtHead(int val) {
            ListNode next = head.next;
            head.next = new ListNode();
            head.next.val = val;
            next.prev = head.next;
            head.next.next = next;
            head.next.prev = head;
            ++size;
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public void addAtTail(int val) {
            ListNode prev = head.prev;
            head.prev = new ListNode();
            head.prev.val = val;
            prev.next = head.prev;
            head.prev.prev = prev;
            head.prev.next = head;
            ++size;
        }

        @TimeComplexity(worst = Complexity.LINEAR_N)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public void addAtIndex(int index, int val) {
            if (index >= 0 && index <= size) {
                ListNode current = head;
                while (current.next != head && index-- > 0) {
                    current = current.next;
                }
                ListNode next = current.next;
                current.next = new ListNode();
                current.next.val = val;
                current.next.next = next;
                current.next.prev = next.prev;
                next.prev = current.next;
                ++size;
            }
        }

        @TimeComplexity(worst = Complexity.LINEAR_N)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public void deleteAtIndex(int index) {
            if (index >= 0 && index < size) {
                ListNode current = head;
                while (current.next != head && index-- > 0) {
                    current = current.next;
                }
                current.next = current.next.next;
                current.next.prev = current;
                --size;
            }
        }
    }
}
