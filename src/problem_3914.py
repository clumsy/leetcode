# class Solution:
#     def minOperations(self, nums: list[int]) -> int:
#         nums.append(nums[-1] + 1)
#         res, p, q = 0, nums[0], deque()
#         for i in nums:
#             if i > p:
#                 cur = q.popleft()
#                 while q:
#                     p = q.popleft()
#                     res += cur - p
#                     cur = p
#             q.append(i)
#             p = i
#         return res


class Solution:
    def minOperations(self, nums: list[int]) -> int:
        res = 0
        for i in range(len(nums) - 1):
            res += max(0, nums[i] - nums[i + 1])
        return res
