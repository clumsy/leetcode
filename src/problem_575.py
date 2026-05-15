class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        res = min(len(candyType) // 2, len(set(candyType)))
        return res
