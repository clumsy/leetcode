class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:
        n, res = len(nums), inf
        for i in range(1, n):
            nums[i] += nums[i - 1]
        for lo in range(n):
            for hi in range(lo + l - 1, min(n, lo + r)):
                cur = nums[hi] - (nums[lo - 1] if lo else 0)
                if cur > 0:
                    res = min(res, cur)
        res = res if res != inf else -1
        return res
