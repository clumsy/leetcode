# class Solution:
#     def limitOccurrences(self, nums: list[int], k: int) -> list[int]:
#         cnt = Counter()
#         res = []
#         for i in nums:
#             cnt[i] = cnt.get(i, 0) + 1
#             if cnt[i] <= k:
#                 res.append(i)
#         return res


class Solution:
    def limitOccurrences(self, nums: list[int], k: int) -> list[int]:
        cur, cnt = 0, k
        for i in range(len(nums)):
            if i:
                if nums[i] == nums[i - 1]:
                    cnt -= 1
                else:
                    cnt = k
            if cnt > 0:
                nums[cur] = nums[i]
                cur += 1
        res = nums
        while len(res) > cur:
            res.pop()
        return res
