import marimo

__generated_with = "0.7.12"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("""[Problem 2104](https://leetcode.com/problems/sum-of-subarray-ranges)""")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution3:
        def subArrayRanges(self, nums: List[int]) -> int:
            res, n = (0, len(nums))
            ma = [[-inf] * n for _ in range(n)]
            mi = [[+inf] * n for _ in range(n)]
            for i in range(n):
                ma[i][i] = mi[i][i] = nums[i]
            for s in range(n):
                for e in range(s + 1, n):
                    ma[s][e] = max(ma[s][e - 1], nums[e])
                    mi[s][e] = min(mi[s][e - 1], nums[e])
                    res += ma[s][e] - mi[s][e]
            return res
    return Solution3,


@app.cell
def __(List):
    class Solution2:
        def subArrayRanges(self, nums: List[int]) -> int:
            res, n = (0, len(nums))
            for s in range(n):
                ma = mi = nums[s]
                for e in range(s + 1, n):
                    ma = max(ma, nums[e])
                    mi = min(mi, nums[e])
                    res += ma - mi
            return res
    return Solution2,


@app.cell
def __(List, inf):
    class Solution:
        def subArrayRanges(self, nums: List[int]) -> int:
            res, n = (0, len(nums))
            s, arr = ([], [-inf] + nums + [-inf])
            for i, e in enumerate(arr):
                while s and arr[s[-1]] > e:
                    j = s.pop()
                    k = s[-1]
                    res -= arr[j] * (i - j) * (j - k)
                s.append(i)
            s, arr = ([], [+inf] + nums + [+inf])
            for i, e in enumerate(arr):
                while s and arr[s[-1]] < e:
                    j = s.pop()
                    k = s[-1]
                    res += arr[j] * (i - j) * (j - k)
                s.append(i)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.subArrayRanges([1, 2, 3]) == 4
    return


@app.cell
def __(sol):
    assert sol.subArrayRanges([1, 3, 3]) == 4
    return


@app.cell
def __(sol):
    assert sol.subArrayRanges([4, -2, -3, 4, 1]) == 59
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
