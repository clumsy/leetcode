class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        s = 0
        for i, e in enumerate(nums):
            nums[i] = -e
            s = s + e
        heapify(nums)
        while nums and -2 * nums[0] >= s:
            s = s + heappop(nums)
        res = s if nums and -2 * nums[0] < s else -1
        return res

# class Solution:
#     def largestPerimeter(self, nums: List[int]) -> int:
#         nums.sort()
#         res, s = (-1, sum(nums[:2]))
#         for e in nums[2:]:
#             if s > e:
#                 res = max(res, s + e)
#             s = s + e
#         return res
