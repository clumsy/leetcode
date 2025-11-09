class Solution:
    def maximumRemovals(self, s: str, p: str, removable: List[int]) -> int:
        removed_after = {r: i for i, r in enumerate(removable)}

        def is_subsequence(s, p, m):
            j = len(p) - 1
            for i in reversed(range(len(s))):
                if removed_after.get(i, inf) >= m and s[i] == p[j]:
                    if j == 0:
                        return True
                    j -= 1
            return False

        lo, hi = 0, len(removable)
        while lo < hi:
            mi = hi - (hi - lo) // 2
            if is_subsequence(s, p, mi):
                lo = mi
            else:
                hi = mi - 1
        return hi
