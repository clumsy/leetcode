class Solution:
    def maxDigitRange(self, nums: list[int]) -> int:
        cnt = defaultdict(int)
        for i in nums:
            ma, mi = -inf, inf
            for d in str(i):
                mi, ma = min(ord(d), mi), max(ord(d), ma)
            cnt[ma - mi] += i
        res = cnt[max(cnt)]
        return res
