class Solution:
    def findKDistantIndices(self, nums: List[int], key: int, k: int) -> List[int]:
        res, n = [], len(nums)
        for j, e in enumerate(nums):
            if e == key:
                res.extend(range(max(res[-1] + 1 if res else 0, j - k), min(j + k + 1, n)))
        return res
