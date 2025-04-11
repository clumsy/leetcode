class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        res = nums[0]
        for i in range(2, len(nums)):
            if nums[i] == nums[i - 1] or nums[i] == nums[i - 2]:
                res = nums[i]
                break
        return res

# class Solution:
#     def repeatedNTimes(self, nums: List[int]) -> int:
#         res = Counter(nums).most_common()[0][0]
#         return res
