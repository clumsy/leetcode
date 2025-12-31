class Solution:
    def findMinFibonacciNumbers(self, k: int) -> int:
        a, b = 1, 1
        fib = [a, b]
        while b < 10**9:
            a, b = b, a + b
            fib.append(b)
        res = 0
        while k > 0:
            i = bisect_left(fib, k)
            if i >= len(fib) or fib[i] > k:
                i -= 1
            k -= fib[i]
            res += 1
        return res
