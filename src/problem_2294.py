class Solution:
    def partitionArray(self, nums: List[int], k: int) -> int:
        nums.sort()
        res, mi = 0, -inf
        for i in nums:
            if i - mi > k:
                mi = i
                res += 1
        return res
