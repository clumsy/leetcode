class Solution:
    def triangularSum(self, nums: List[int]) -> int:
        res, n, n_k = 0, len(nums), 1
        # pascal triangle, count binomial coefficients
        # i corresponds to i - 1 th power polynomial
        for i in range(n):
            res = (res + nums[i] * n_k) % 10
            n_k = (n_k * (n - i - 1) // (i + 1))
        return res % 10
