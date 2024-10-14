import marimo

__generated_with = "0.9.9"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3309](https://leetcode.com/problems/maximum-possible-number-by-binary-concatenation)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution2:
        def maxGoodNumber(self, nums: List[int]) -> int:
            for i, e in enumerate(nums):
                nums[i] = bin(e)[2:]
            res, n = 0, len(nums)
            for i in range(n):
                for j in range(n):
                    if i != j:
                        cur = int("".join(nums[k] for k in (i, j, 3 - i - j)), 2)
                        res = max(res, cur)
            return res
    return (Solution2,)


@app.cell
def __():
    from functools import cmp_to_key
    return (cmp_to_key,)


@app.cell
def __(List, cmp_to_key):
    class Solution:
        def maxGoodNumber(self, nums: List[int]) -> int:
            def ord(a, b):
                return -1 if a + b > b + a else 1
            b = "".join(sorted((bin(i)[2:] for i in nums), key=cmp_to_key(ord)))
            res = int(b, 2)
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.maxGoodNumber([1,2,3]) == 30
    return


@app.cell
def __(sol):
    assert sol.maxGoodNumber([2,8,16]) == 1296
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
