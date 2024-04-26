import marimo

__generated_with = "0.4.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[3038](https://leetcode.com/problems/maximum-number-of-operations-with-the-same-score-i)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maxOperations(self, nums: List[int]) -> int:
            res, v, n = 1, nums[0] + nums[1], len(nums)
            for i in range(2, n, 2):
                if i + 1 >= n or nums[i] + nums[i + 1] != v:
                    break
                res += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxOperations([3,2,1,4,5]) == 2
    return


@app.cell
def __(sol):
    assert sol.maxOperations([3,2,6,1,4]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
