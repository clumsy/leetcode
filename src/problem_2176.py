import marimo

__generated_with = "0.8.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("""[Problem 2176](https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution2:

        def countPairs(self, nums: List[int], k: int) -> int:
            res, n = (0, len(nums))
            for i in range(n):
                for j in range(i + 1, n):
                    res += nums[i] == nums[j] and i * j % k == 0
            return res
    return Solution2,


@app.cell
def __():
    from collections import defaultdict
    from math import gcd
    return defaultdict, gcd


@app.cell
def __(List, defaultdict, gcd):
    class Solution:

        def countPairs(self, nums: List[int], k: int) -> int:
            res, n, m = (0, len(nums), defaultdict(list))
            for i, e in enumerate(nums):
                m[e].append(i)
            for e, ids in m.items():
                gcds = defaultdict(int)
                for i in ids:
                    gi = gcd(i, k)
                    for gj, c in gcds.items():
                        res += c * (gi * gj % k == 0)
                    gcds[gi] += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countPairs([3, 1, 2, 2, 2, 1, 3], 2) == 4
    return


@app.cell
def __(sol):
    assert sol.countPairs([1, 2, 3, 4], 1) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
