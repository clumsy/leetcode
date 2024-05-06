import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3095](https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-i)")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    from math import inf
    return List, defaultdict, inf


@app.cell
def __(List, defaultdict, inf):
    class Solution:
        def minimumSubarrayLength(self, nums: List[int], k: int) -> int:
            mask = j = 0
            res, cnt = inf, defaultdict(int)
            for i in range(len(nums)):
                mask |= nums[i]
                a = 0
                while (1 << a) <= nums[i]:
                    if nums[i] & (1 << a) == (1 << a):
                        cnt[a] += 1
                    a += 1
                while j <= i and mask >= k:
                    res = min(res, i - j + 1)
                    a = 0
                    while (1 << a) <= nums[j]:
                        if nums[j] & (1 << a) == (1 << a):
                            cnt[a] -= 1
                            if cnt[a] == 0:
                                mask &= ~(1 << a)
                        a += 1
                    j += 1
            res = res if res != inf else -1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumSubarrayLength([1,2,3], 2) == 1
    return


@app.cell
def __(sol):
    assert sol.minimumSubarrayLength([2,1,8], 10) == 3
    return


@app.cell
def __(sol):
    assert sol.minimumSubarrayLength([1,2], 0) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
