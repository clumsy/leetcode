package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.TWO_POINTERS)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.N_PLUS_M) // where N is the length of list1 and M is the length of list2
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ath = list1;
        ListNode bth = list1;
        for (int i = 0; i < b; ++i) {
            if (i == a - 1) {
                ath = bth;
            }
            bth = bth.next;
        }
        ath.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = bth.next;
        return list1;
    }
}
