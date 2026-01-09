class Solution:
    def minSubsequence(self, nums: List[int]) -> List[int]:
        nums.sort(reverse=True)
        s1, s2 = 0, sum(nums)
        res = []
        for i in nums:
            res.append(i)
            s1 += i
            s2 -= i
            if s1 > s2:
                break
        return res
