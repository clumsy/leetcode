from math import prod


class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        pos, neg = heapq.nlargest(3, nums), heapq.nsmallest(2, nums)
        res = max(prod(pos), prod(neg) * pos[0])
        return res
