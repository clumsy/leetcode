# class Solution:
#     def findDifferentBinaryString(self, nums: List[str]) -> str:
#         s = set(int(i, 2) for i in nums)
#         n = len(nums)
#         for i in range(0, 2 ** n + 1):
#             if i not in s:
#                 res = f"{i:b}".zfill(n)
#                 break
#         return res


class Solution:
    def findDifferentBinaryString(self, nums: List[str]) -> str:
        res = "".join(("0" if c[i] == "1" else "1" for i, c in enumerate(nums)))
        return res
