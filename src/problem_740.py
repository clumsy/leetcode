class Solution:
    def deleteAndEarn(self, nums: List[int]) -> int:
        n = max(nums)
        cnt = [0] * n
        for i in nums:
            cnt[i - 1] += i
        for i in range(n):
            cnt[i] = max(cnt[i] + (cnt[i - 2] if i > 1 else 0), cnt[i - 1] if i > 0 else 0)
        res = cnt[-1]
        return res
