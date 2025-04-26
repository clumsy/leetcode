class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        rank = {e: r + 1 for r, e in enumerate(sorted(set(arr)))}
        res = [rank[i] for i in arr]
        return res
