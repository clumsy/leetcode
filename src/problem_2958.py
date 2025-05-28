class Solution:
    def maxSubarrayLength(self, nums: List[int], k: int) -> int:
        res = cur = 0
        cnt = Counter()
        for i, e in enumerate(nums):
            cnt[e] += 1
            cur += 1
            while cnt[e] > k:
                cnt[nums[i - cur + 1]] -= 1
                cur -= 1
            res = max(res, cur)
        return res
