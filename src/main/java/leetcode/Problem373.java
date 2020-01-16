package leetcode;

import java.util.*;
import java.util.function.BiConsumer;

public class Problem373 {
    public static final class Alternative extends Problem373 {

        @Override
        public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            Comparator<List<Integer>> listComparator = Comparator.comparingInt(list -> (list.get(0) + list.get(1)));
            PriorityQueue<List<Integer>> kSmallest = new PriorityQueue<>(k, listComparator.reversed());
            for (int i : nums1) {
                for (int j : nums2) {
                    kSmallest.offer(Arrays.asList(i, j));
                    if (kSmallest.size() > k) {
                        kSmallest.poll();
                    }
                }
            }
            return new ArrayList<>(kSmallest);
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (nums1.length*nums2.length == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>(k);
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(array -> array[0]));
        BiConsumer<Integer, Integer> push = (i, j) -> {
            if (i < nums1.length && j < nums2.length) {
                minHeap.add(new int[] {nums1[i] + nums2[j], i, j});
            }
        };
        push.accept(0, 0);
        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] entry = minHeap.poll();
            int i = entry[1];
            int j = entry[2];
            result.add(Arrays.asList(nums1[i], nums2[j]));
            push.accept(i, j + 1);
            if (j == 0) {
                push.accept(i + 1, 0);
            }
        }
        return result;
    }
}
