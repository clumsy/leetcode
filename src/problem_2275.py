class Solution:
    def largestCombination(self, candidates: List[int]) -> int:
        res = max(sum(i & 1 << b != 0 for i in candidates) for b in range(30))
        return res
