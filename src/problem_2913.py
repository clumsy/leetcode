class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        res, cnt, n = 0, set(), len(nums)
        for i in range(n):
            for j in range(i, n):
                cnt.add(nums[j])
                res += len(cnt) ** 2
            cnt.clear()
        return res
