package leetcode;

import java.util.LinkedList;
import java.util.List;

@BeatsPercent(62.65)
// Time: LOG(N) + K
public class Problem658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            int mid = hi - (hi - lo)/2;
            if (arr[mid] > x) {
                hi = mid - 1;
            } else {
                lo = mid;
            }
        }
        hi = lo + 1;
        LinkedList<Integer> result = new LinkedList<>();
        while (k-- > 0) {
            if (lo < 0 || (hi < arr.length && Math.abs(arr[hi] - x) < Math.abs(arr[lo] - x))) {
                result.addLast(arr[hi++]);
            } else {
                result.addFirst(arr[lo--]);
            }
        }
        return result;
    }
}
