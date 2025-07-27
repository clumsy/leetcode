class Solution:
    def checkDivisibility(self, n: int) -> bool:
        dgts = [int(d) for d in str(n)]
        res = n % (sum(dgts) + reduce(operator.mul, dgts)) == 0
        return res
