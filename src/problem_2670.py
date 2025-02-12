class Solution:
    def distinctDifferenceArray(self, nums: List[int]) -> List[int]:
        lft, rgt, n = Counter(), Counter(nums), len(nums)
        res = [None] * n
        for i in range(n):
            num = nums[i]
            lft[num] += 1
            rgt[num] -= 1
            if rgt[num] == 0:
                del rgt[num]
            res[i] = len(lft) - len(rgt)
        return res
