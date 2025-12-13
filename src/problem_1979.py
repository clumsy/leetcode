class Solution:
    def findGCD(self, nums: List[int]) -> int:
        def gcd(a, b):
            return a if b == 0 else gcd(b, a % b)

        mi = ma = nums[0]
        for i in nums:
            mi, ma = min(mi, i), max(ma, i)
        res = gcd(mi, ma)
        return res
