package leetcode;

public class Problem88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            int left = nums1[m];
            int right = nums2[n];
            if (left > right) {
                nums1[last--] = nums1[m--];
            } else {
                nums1[last--] = nums2[n--];
            }
        }
        while (n >= 0) {
            nums1[n] = nums2[n];
            n--;
        }
    }
}
