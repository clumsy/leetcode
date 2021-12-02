package leetcode;

import org.junit.Test;

public class Problem707Test {
    private final Problem707 solution = new Problem707();
    
    @Test
    public void example1() {
        Problem707.MyLinkedList myLinkedList = solution.new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        assert myLinkedList.get(1) == 2;
        myLinkedList.deleteAtIndex(1);
        assert myLinkedList.get(1) == 3;
    }
}
