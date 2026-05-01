class Solution:
    def maxSatisfied(self, customers: List[int], grumpy: List[int], minutes: int) -> int:
        lo, n = 0, len(customers)
        sat = ma = cur = 0
        for i in range(n):
            if grumpy[i]:
                while i - lo + 1 > minutes:
                    cur -= customers[lo] if grumpy[lo] else 0
                    lo += 1
                cur += customers[i]
                ma = max(ma, cur)
            else:
                sat += customers[i]
        res = sat + ma
        return res
