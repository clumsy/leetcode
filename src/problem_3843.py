class Solution:
    def firstUniqueFreq(self, nums: List[int]) -> int:
        cnt = Counter(nums)
        ccnt = Counter(cnt.values())
        res = next((i for i in nums if ccnt[cnt[i]] == 1), -1)
        return res
