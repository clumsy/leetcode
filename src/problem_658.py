from collections import deque


class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        n = len(arr)
        lo, hi, left, right = (0, n - 1, deque(), deque())
        while lo < hi:
            mi = lo + (hi - lo) // 2
            if arr[mi] >= x:
                hi = mi
            else:
                lo = mi + 1
        lo, hi = (lo - 1, lo)
        while k > 0:
            if hi < n and (lo < 0 or abs(arr[hi] - x) < abs(arr[lo] - x)):
                right.append(arr[hi])
                hi = hi + 1
            elif lo >= 0 and (hi >= n or abs(arr[hi] - x) >= abs(arr[lo] - x)):
                left.appendleft(arr[lo])
                lo = lo - 1
            k = k - 1
        return list(left + right)
