class Solution:
    def rangeSum(self, nums: List[int], n: int, left: int, right: int) -> int:
        MOD = 10**9 + 7
        h = [(x, i) for i, x in enumerate(nums)]
        heapify(h)  # min-heap
        res = 0
        for k in range(1, right + 1):  # 1-indexed
            x, i = heappop(h)
            if k >= left:  # should be counted
                res += x
            if i + 1 < n:  # can add next element
                heappush(h, (x + nums[i + 1], i + 1))
        return res % MOD
