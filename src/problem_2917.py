class Solution:
    def findKOr(self, nums: List[int], k: int) -> int:
        cnt = Counter()
        for e in nums:
            i = 0
            while e:
                e, r = divmod(e, 2)
                cnt[i] += r
                i += 1
        res = sum(2 ** i for i, c in cnt.items() if c >= k)
        return res
