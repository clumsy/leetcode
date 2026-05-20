class Solution:
    def canPlaceFlowers(self, f: List[int], k: int) -> bool:
        n = len(f)
        for i in range(n):
            if k == 0:
                break
            if f[i] == 1:
                continue
            if (i == n - 1 or f[i + 1] == 0) and (i == 0 or f[i - 1] == 0):
                f[i] = 1
                k -= 1
        res = k == 0
        return res
