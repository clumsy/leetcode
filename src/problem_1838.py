class Solution:
    def maxFrequency(self, nums: List[int], k: int) -> int:
        n, nums = len(nums), sorted(nums)
        lo = hi = n - 1
        c, res = k, 0
        while lo >= 0:
            while c >= 0:
                res = max(res, hi - lo + 1)
                lo -= 1
                if lo >= 0:
                    c -= nums[hi] - nums[lo]
                else:
                    break
            c += (hi - lo) * (nums[hi] - nums[hi - 1])
            hi -= 1
        return res
