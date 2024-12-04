class Solution:
    def resultsArray(self, nums: List[int], k: int) -> List[int]:
        res, d1 = [], 1
        for i in range(len(nums)):
            if i:
                d1 = min(k, d1 + 1) if nums[i] - nums[i - 1] == 1 else 1
            if i + 1 >= k:
                res.append(nums[i] if d1 == k else -1)
        return res
