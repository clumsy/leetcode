package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.CONSTANT)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
