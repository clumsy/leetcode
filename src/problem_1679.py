# class Solution:
#     def maxOperations(self, nums: List[int], k: int) -> int:
#         cnt = Counter(nums)
#         res = sum(min(cnt[i], cnt[k - i]) for i in cnt) // 2
#         return res


class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        nums.sort()
        res = 0
        lo, hi = (0, len(nums) - 1)
        while lo < hi:
            d = nums[hi] + nums[lo] - k
            if d > 0:
                hi = hi - 1
            elif d < 0:
                lo = lo + 1
            else:
                res = res + 1
                lo = lo + 1
                hi = hi - 1
        return res
