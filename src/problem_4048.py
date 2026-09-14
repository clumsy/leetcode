class Solution:
    def countSpecialIntegers(self, nums: list[int]) -> int:
        cnt, dst, lst = defaultdict(int), defaultdict(int), defaultdict(int)
        for i, v in enumerate(nums):
            cnt[v] += 1
            if cnt[v] == 2:
                dst[v] = i - lst[v] + 1
            elif cnt[v] > 2 and (i - lst[v] + 1) != dst[v]:
                dst[v] = 0
            lst[v] = i
        res = sum(k == 3 and dst[v] > 0 for v, k in cnt.items())
        return res
