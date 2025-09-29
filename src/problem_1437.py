class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        res, prev = True, -k - 1
        for i, v in enumerate(nums):
            if v == 0:
                continue
            if i - 1 - prev < k:
                res = False
                break
            prev = i
        return res
