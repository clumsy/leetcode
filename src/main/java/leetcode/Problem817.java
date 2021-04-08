package leetcode;

import java.util.HashSet;
import java.util.Set;

@BeatsPercent(89.34)
public class Problem817 {
    public int numComponents(ListNode head, int[] G) {
        int n = G.length;
        Set<Integer> gHas = new HashSet<>(n, 1);
        for (int g : G) {
            gHas.add(g);
        }
        int components = n;
        while (head != null && head.next != null) {
            if (gHas.contains(head.val) && gHas.contains(head.next.val)) {
                components--;
            }
            head = head.next;
        }
        return components;
    }
}
