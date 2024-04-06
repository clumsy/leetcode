import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3097](https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-ii)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    from functools import reduce
    from math import inf
    import operator
    return Counter, List, inf, operator, reduce


@app.cell
def __(Counter, List, inf, operator, reduce):
    class Solution:
        def minimumSubarrayLength(self, nums: List[int], k: int) -> int:
            cnt = Counter()
            def update(d, val):
                i = 0
                while (1 << i) <= val:
                    if val & (1 << i) == (1 << i):
                        cnt[i] += d
                        if cnt[i] == 0:
                            del cnt[i]
                    i += 1

            def current():
                return reduce(operator.ior, (1 << i for i in cnt)) if cnt else 0
            res, j = inf, 0
            for i, e in enumerate(nums):
                update(1, e)
                while j <= i and current() >= k:
                    res = min(res, i - j + 1)
                    update(-1, nums[j])
                    j += 1
            res = res if res < inf else -1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumSubarrayLength([1,2,3], 3) == 1
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
