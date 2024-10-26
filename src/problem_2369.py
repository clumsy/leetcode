import marimo

__generated_with = "0.9.14"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2369](https://leetcode.com/problems/check-if-there-is-a-valid-partition-for-the-array)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def validPartition(self, nums: List[int]) -> bool:
            n = len(nums)
            dp = [True, False, nums[0] == nums[1], False]
            for i in range(2, n):
                two = nums[i - 1] == nums[i]
                three = two and nums[i - 2] == nums[i]
                cons = nums[i - 2] + 2 == nums[i - 1] + 1 == nums[i]
                dp[(i + 1) % len(dp)] = (dp[(i - 1) % len(dp)] and two) or (dp[(i - 2) % len(dp)] and (three or cons))
            res = dp[n % len(dp)]
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.validPartition([4,4,4,5,6])
    return


@app.cell
def __(sol):
    assert not sol.validPartition([1,1,1,2])
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
