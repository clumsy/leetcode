class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:
        n, ma = len(nums), max(nums)
        res = lo = hi = 0
        k -= nums[lo] == ma
        while lo < n:
            while hi + 1 < n and k > 0:
                hi += 1
                if nums[hi] == ma:
                    k -= 1
            if k == 0:
                res += n - hi
            k += nums[lo] == ma
            lo += 1
        return res
