class Solution:
    def diagonalPrime(self, nums: List[List[int]]) -> int:
        MAX = max(max(r) for r in nums) + 1
        prime = [True] * MAX
        prime[1] = False
        for i in range(2, MAX):
            if prime[i]:
                for j in range(2, MAX):
                    if i * j >= MAX:
                        break
                    prime[i * j] = False
        n, res = len(nums), 0
        for i in range(n):
            e = nums[i][i]
            if e > res and prime[e]:
                res = e
            e = nums[i][n - 1 - i]
            if e > res and prime[e]:
                res = e
        return res
