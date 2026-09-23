class Solution:
    def sumDivisibleByK(self, nums: List[int], k: int) -> int:
        cnt = Counter(nums)
        res = sum(i * c for i, c in cnt.items() if c % k == 0)
        return res
