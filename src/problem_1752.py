class Solution:
    def check(self, nums: List[int]) -> bool:
        n, drop, res = len(nums), 0, True
        for i in range(n):
            if nums[i] > nums[(i + 1) % n]:
                drop += 1
            if drop > 1:
                res = False
                break
        return res
