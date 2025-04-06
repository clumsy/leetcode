class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        n, mi, ma = len(nums), min(nums), max(nums)
        if n <= 2 or ma == mi:
            res = ma - mi
        else:
            bs = defaultdict(list)
            for i in nums:
                bi = n - 2 if i == ma else (i - mi) * (n - 1) // (ma - mi)
                bs[bi].append(i)
            bs = [(min(bs[i]), max(bs[i])) for i in range(n - 1) if bs[i]]
            res = max(by[0] - bx[1] for bx, by in zip(bs, bs[1:]))
        return res
