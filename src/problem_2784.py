class Solution:
    def isGood(self, nums: List[int]) -> bool:
        cnt, n = Counter(nums), len(nums) - 1
        res = all(cnt[i] == 1 for i in range(1, n)) and cnt[n] == 2
        return res
