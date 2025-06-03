class Solution:
    def incremovableSubarrayCount(self, nums: List[int]) -> int:
        n = len(nums)
        res = 0
        lo = -inf
        for i in range(n):
            res += 1  # can remove [i:]
            hi = inf
            for j in range(i + 1, n)[::-1]:
                if not (lo < nums[j] < hi):
                    break
                res += 1  # can remove [i:j]
                hi = nums[j]
            if nums[i] <= lo:
                break
            lo = nums[i]
        return res
