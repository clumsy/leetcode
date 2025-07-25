class Solution:
    def countBeautifulPairs(self, nums: List[int]) -> int:
        def gcd(a, b):
            return a if b == 0 else gcd(b, a % b)
        cnt, res = Counter(), 0
        for e in nums:
            for k, v in cnt.items():
                if gcd(k, e % 10) == 1:
                    res += v
            cnt[int(str(e)[0])] += 1
        return res
