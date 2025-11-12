class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        s, mi, ma = set(), inf, -inf
        for i in nums:
            mi = min(mi, i)
            ma = max(ma, i)
            s.add(i)
        res = [i for i in range(mi, ma + 1) if i not in s]
        return res
