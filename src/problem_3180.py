import marimo

__generated_with = "0.9.11"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3180](https://leetcode.com/problems/maximum-total-reward-using-operations-i)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution2:
        def maxTotalReward(self, rv: List[int]) -> int:
            rv.sort()
            n, res = len(rv), 0
            dp = [set() for _ in range(n)]
            for i in range(n):
                dp[i].update(dp[i - 1])
                for k in dp[i - 1]:
                    if k < rv[i]:
                        dp[i].add(k + rv[i])
                dp[i].add(rv[i])
                res = max(res, max(dp[i]))
            return res
    return (Solution2,)


@app.cell
def __(List):
    class Solution:
        def maxTotalReward(self, rv: List[int]) -> int:
            rv.sort()
            n, res = len(rv), 0
            dp = [False] * (2 * rv[-1] + 1)
            dp[0] = True
            for i in range(n):
                for j in range(rv[i]):
                    dp[j + rv[i]] |= dp[j]
            res = next(i for i in reversed(range(len(dp))) if dp[i])
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.maxTotalReward([1,1,3,3]) == 4
    return


@app.cell
def __(sol):
    assert sol.maxTotalReward([1,6,4,3,2]) == 11
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
