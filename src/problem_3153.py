import marimo

__generated_with = "0.6.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(rf"[Problem 3153](https://leetcode.com/problems/sum-of-digit-differences-of-all-pairs)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution2:
        def sumDigitDifferences(self, nums: List[int]) -> int:
            d = [[0] * 11 for _ in range(len(str(nums[0])))]
            n = len(nums)
            for i in range(n):
                cur, j = nums[i], len(d) - 1
                while j >= 0:
                    cur, r = divmod(cur, 10)
                    d[j][r] += 1
                    d[j][10] += 1
                    j -= 1
            res = 0
            for i in range(n):
                cur, j = nums[i], len(d) - 1
                while j >= 0:
                    cur, r = divmod(cur, 10)
                    res += d[j][10] - d[j][r]
                    d[j][10] -= 1
                    d[j][r] -= 1
                    j -= 1
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def sumDigitDifferences(self, nums: List[int]) -> int:
            n, m = len(nums), len(str(nums[0]))
            cnt = [[0] * 10 for _ in range(m)]
            res = n * (n - 1) // 2 * m
            for i in range(n):
                for j in reversed(range(m)):
                    nums[i], r = divmod(nums[i], 10)
                    res -= cnt[j][r]
                    cnt[j][r] += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.sumDigitDifferences([13,23,12]) == 4
    return


@app.cell
def __(sol):
    assert sol.sumDigitDifferences([10,10,10,10]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
