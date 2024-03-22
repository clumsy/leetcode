import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 823](https://leetcode.com/problems/binary-trees-with-factors)")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    from functools import cache
    return List, cache, defaultdict


@app.cell
def __(List, cache):
    class Solution2:
        def numFactoredBinaryTrees(self, arr: List[int]) -> int:
            arr = set(arr)

            @cache
            def dfs(cur):
                res = 1
                for i in arr:
                    if i < cur and cur % i == 0 and (cur // i) in arr:
                        res += dfs(i) * dfs(cur // i)
                return res

            res = sum(dfs(i) for i in arr) % int(1e9 + 7)
            return res
    return Solution2,


@app.cell
def __(List, defaultdict):
    class Solution:
        def numFactoredBinaryTrees(self, arr: List[int]) -> int:
            dp = defaultdict(int)
            arr.sort()
            for i in range(len(arr)):
                dp[arr[i]] = 1
                for j in range(i):
                    if arr[i] % arr[j] == 0:
                        dp[arr[i]] += dp[arr[j]] * dp[arr[i] // arr[j]]
            res = sum(dp.values()) % int(1e9 + 7)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numFactoredBinaryTrees([2,4]) == 3
    return


@app.cell
def __(sol):
    assert sol.numFactoredBinaryTrees([2,4,5,10]) == 7
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
