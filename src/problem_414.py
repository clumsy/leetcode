class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        q = []
        for i in nums:
            if i not in q:
                heappush(q, i)
                if len(q) > 3:
                    heappop(q)
        res = heappop(q) if len(q) == 3 else max(q)
        return res
