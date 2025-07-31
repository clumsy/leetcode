# class Solution:
#     def splitArray(self, nums: List[int]) -> int:
#         def is_prime(n):
#             if n < 2:
#                 return False
#             if n < 4:
#                 return True
#             if n % 2 == 0 or n % 3 == 0:
#                 return False
#             i = 5
#             while i * i <= n:
#                 if n % i == 0 or n % (i + 2) == 0:
#                     return False
#                 i += 6
#             return True
#         a = b = 0
#         for i, e in enumerate(nums):
#             if is_prime(i):
#                 b += e
#             else:
#                 a += e
#         res = abs(a - b)
#         return res

class Solution:
    def splitArray(self, nums: List[int]) -> int:
        n, sm = len(nums), sum(nums)
        for i in range(2, n):
            if nums[i] == 0:
                continue
            for j in range(i * i, n, i):
                nums[j] = 0   
        res = abs(2 * sum(nums[2:]) - sm)
        return res
