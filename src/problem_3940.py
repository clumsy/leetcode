class Solution:
    def limitOccurrences(self, nums: list[int], k: int) -> list[int]:
        cnt = Counter()
        res = []
        for i in nums:
            cnt[i] = cnt.get(i, 0) + 1
            if cnt[i] <= k:
                res.append(i)
        return res
