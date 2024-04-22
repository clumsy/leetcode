import marimo

__generated_with = "0.4.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 209](https://leetcode.com/problems/minimum-size-subarray-sum)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution2:
        def minSubArrayLen(self, target: int, nums: List[int]) -> int:
            n, res = len(nums), len(nums) + 1
            for i in range(n - 1):
                nums[i + 1] += nums[i]
            for i in range(n):
                tgt, lo, hi = target + (0 if i == 0 else nums[i - 1]), i, n - 1
                while lo < hi:
                    mi = lo + (hi - lo) // 2
                    if nums[mi] >= tgt:
                        hi = mi
                    else:
                        lo = mi + 1
                if nums[lo] >= tgt:
                    res = min(res, lo - i + 1)
            return res if res <= n else 0
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def minSubArrayLen(self, target: int, nums: List[int]) -> int:
            acc, s, e, n, res = 0, 0, 0, len(nums), len(nums) + 1
            for e in range(n):
                acc += nums[e]
                while s <= e and acc - nums[s] >= target:
                    acc -= nums[s]
                    s += 1
                if acc >= target:
                    res = min(res, e - s + 1)
            return res if res <= n else 0
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minSubArrayLen(7, [2,3,1,2,4,3]) == 2
    return


@app.cell
def __(sol):
    assert sol.minSubArrayLen(4, [1,4,4]) == 1
    return


@app.cell
def __(sol):
    assert sol.minSubArrayLen(11, [1,1,1,1,1,1,1,1]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
