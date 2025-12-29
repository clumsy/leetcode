# class Solution:
#     def countMajoritySubarrays(self, nums: List[int], target: int) -> int:
#         res, n = 0, len(nums)
#         for i in range(n):
#             nums[i] = (nums[i - 1] if i else 0) + (nums[i] == target)
#         for l in range(n):
#             for h in range(l, n):
#                 res += nums[h] - (nums[l - 1] if l else 0) > (h + 1 - l) / 2
#         return res


class Solution:
    def countMajoritySubarrays(self, A: List[int], target: int) -> int:
        n = len(A)
        count = [1] + [0] * (n + n + 2)
        acc = [1] + [0] * (n + n + 2)
        res = pre = 0
        for a in A:
            pre += 1 if a == target else -1
            count[pre] += 1
            acc[pre] = acc[pre - 1] + count[pre]
            # current has pre, thus for every acc[pre - 1] if can form an interval i..j with target majority
            res += acc[pre - 1]
        return res
