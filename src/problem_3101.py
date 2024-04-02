import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3101](https://leetcode.com/problems/count-alternating-subarrays)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution2:
        def countAlternatingSubarrays(self, nums: List[int]) -> int:
            dp = [[0, 0] for _ in range(len(nums))]
            for i, e in enumerate(nums):
                if e == 0:
                    dp[i][0] = (dp[i - 1][1] if i > 0 else 0) + 1
                else:
                    dp[i][1] = (dp[i - 1][0] if i > 0 else 0) + 1
            res = sum(sum(r) for r in dp)
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def countAlternatingSubarrays(self, nums: List[int]) -> int:
            zer = one = res = 0
            for i, e in enumerate(nums):
                if e == 0:
                    zer, one = one + 1, 0
                else:
                    one, zer = zer + 1, 0
                res += zer + one
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countAlternatingSubarrays([0,1,1,1]) == 5
    return


@app.cell
def __(sol):
    assert sol.countAlternatingSubarrays([1,0,1,0]) == 10
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
