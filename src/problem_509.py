class Solution:
    def fib(self, n: int) -> int:
        fn_1, fn = 0, 1
        while n > 1:
            fn_1, fn = fn, fn_1 + fn
            n -= 1
        return fn if n > 0 else fn_1
