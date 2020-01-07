package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Problem23 {
    static final class Alternative extends Problem23 {

        @Override
        public ListNode mergeKLists(ListNode[] lists) {
            ListNode root = new ListNode(0);
            ListNode current = root;
            ListNode previous = null;
            while (current != previous) {
                previous = current;
                int min = Integer.MAX_VALUE;
                for (ListNode list : lists) {
                    if (list != null) {
                        min = Math.min(min, list.val);
                    }
                }
                for (int i = 0; i < lists.length; i++) {
                    while (lists[i] != null && min == lists[i].val) {
                        lists[i] = lists[i].next;
                        ListNode next = new ListNode(min);
                        current.next = next;
                        current = next;
                    }
                }
            }
            return root.next;
        }
    }

    static final class Alternative2 extends Problem23 {

        @Override
        public ListNode mergeKLists(ListNode[] lists) {
            ListNode root = new ListNode(0);
            ListNode current = root;
            PriorityQueue<ListNode> minHeap = new PriorityQueue<>(10, Comparator.comparingInt(o -> o.val));
            for (ListNode list : lists) {
                if (list != null) {
                    minHeap.add(list);
                }
            }
            while (!minHeap.isEmpty()) {
                ListNode min = minHeap.poll();
                current.next = new ListNode(min.val);
                current = current.next;
                min = min.next;
                if (min != null) {
                    minHeap.offer(min);
                }
            }
            return root.next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;
        switch (length) {
            case 1:
                return lists[0];
            case 0:
                return null;
        }
        while (length > 1) {
            int index = 0;
            for (int i = 0; i < length; i += 2) {
                if (i + 1 < length) {
                    lists[index++] = mergeLists(lists[i], lists[i + 1]);
                } else {
                    lists[index++] = lists[i];
                }
            }
            if (length % 2 == 0) {
                length /= 2;
            } else {
                length = length/2 + 1;
            }
        }
        return lists[0];
    }

    private ListNode mergeLists(ListNode first, ListNode second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        ListNode firstCursor = first;
        ListNode secondCursor = second;
        ListNode root = new ListNode(0);
        ListNode current = root;
        while (firstCursor != null && secondCursor != null) {
            if (firstCursor.val < secondCursor.val) {
                current.next = new ListNode(firstCursor.val);
                firstCursor = firstCursor.next;
            } else {
                current.next = new ListNode(secondCursor.val);
                secondCursor = secondCursor.next;
            }
            current = current.next;
        }
        if (firstCursor != null) {
            current.next = firstCursor;
        }
        if (secondCursor != null) {
            current.next = secondCursor;
        }
        return root.next;
    }
}
