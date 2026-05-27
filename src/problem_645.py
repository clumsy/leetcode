# class Solution:
#     def findErrorNums(self, nums: List[int]) -> List[int]:
#         for i, num in enumerate(nums):
#             while nums[num - 1] != num:
#                 nums[i], nums[num - 1] = nums[num - 1], nums[i]
#                 num = nums[i]
#             if i != num - 1:
#                 dupe = num
#                 break
#         n = len(nums)
#         # s - x + y = sum(nums)
#         diff = ((1 + n) * n) // 2 - sum(nums)
#         res = [dupe, dupe + diff]
#         return res


class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        n, x = (len(nums), 0)
        a = -sum(nums) + n * (n + 1) // 2
        b = -sum((i**2 for i in nums)) + n * (n + 1) * (2 * n + 1) // 6
        x = (b - a**2) // (2 * a)
        y = (b + a**2) // (2 * a)
        res = [x, y]
        return res
