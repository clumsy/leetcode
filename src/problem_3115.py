import marimo

__generated_with = "0.3.12"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3115](https://leetcode.com/problems/maximum-prime-difference)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maximumPrimeDifference(self, nums: List[int]) -> int:
            primes = [True] * (max(nums) + 1)
            primes[1] = False
            for i in range(2, len(primes)):
                if primes[i]:
                    for j in range(i * i, len(primes), i):
                        primes[j] = False
            lo, hi = 0, len(nums) - 1
            while hi > lo and not primes[nums[hi]]:
                hi -= 1
            while lo < hi and not primes[nums[lo]]:
                lo += 1
            res = hi - lo
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumPrimeDifference([4,2,9,5,3]) == 3
    return


@app.cell
def __(sol):
    assert sol.maximumPrimeDifference([4,8,2,8]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
