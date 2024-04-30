import marimo

__generated_with = "0.4.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3048](https://leetcode.com/problems/earliest-second-to-mark-indices-i)")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution2:
        def earliestSecondToMarkIndices(self, nums: List[int], idxs: List[int]) -> int:
            n, m = len(nums), len(idxs)
            s = sum(nums) + n
            lst = defaultdict(int)
            res = None
            for i in range(m):
                idx = idxs[i]
                lst[idx - 1] = i + 1
                if len(lst) == n and i + 1 >= s:
                    prv = cur = 0
                    for i, id in sorted((i, id) for id, i in lst.items()):
                        cur += i - prv - (nums[id] + 1)
                        if cur < 0:
                            break
                        prv = i
                    else:
                        res = i
                        break
            res = res if res is not None else -1
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def earliestSecondToMarkIndices(self, nums: List[int], idxs: List[int]) -> int:
            n, m = len(nums), len(idxs)

            def binsearch(mi):
                lst = {idxs[i]: i for i in range(mi + 1)}
                if len(lst) < n:
                    return False
                cur = 0
                for i in range(mi + 1):
                    if i == lst[idxs[i]]:
                        cur -= nums[idxs[i] - 1]
                        if cur < 0:
                            break
                    else:
                        cur += 1
                return cur >= 0

            lo, hi = 0, m
            while lo < hi:
                mi = lo + (hi - lo) // 2
                if binsearch(mi):
                    hi = mi
                else:
                    lo = mi + 1
            res = lo + 1 if lo < m else -1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.earliestSecondToMarkIndices([2,2,0], [2,2,2,2,3,2,2,1]) == 8
    return


@app.cell
def __(sol):
    assert sol.earliestSecondToMarkIndices([1,3], [1,1,1,2,1,1,1]) == 6
    return


@app.cell
def __(sol):
    assert sol.earliestSecondToMarkIndices([0,1], [2,2,2]) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
