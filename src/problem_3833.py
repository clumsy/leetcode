class Solution:
    def dominantIndices(self, nums: List[int]) -> int:
        res = cnt = ttl = 0
        for i in reversed(range(len(nums))):
            res += nums[i] > ttl / cnt if cnt else 0
            cnt += 1
            ttl += nums[i]
        return res
