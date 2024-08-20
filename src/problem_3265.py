import marimo

__generated_with = "0.8.13"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3265](https://leetcode.com/problems/count-almost-equal-pairs-i)""")
    return


@app.cell
def __():
    from typing import List
    from itertools import zip_longest
    return List, zip_longest


@app.cell
def __(List, zip_longest):
    class Solution2:
        def countPairs(self, nums: List[int]) -> int:
            res, n = 0, len(nums)
            for i in range(n):
                nums[i] = str(nums[i])[::-1]
            def almost_equal(i, j):
                diff = None
                for f, s in zip_longest(nums[i], nums[j], fillvalue="0"):
                    if f != s:
                        if diff is None:
                            diff = (f, s)
                        elif diff == -1:
                            return False
                        else:
                            if (s, f) != diff:
                                return False
                            diff = -1
                if diff is not None and diff != -1:
                    return False
                return True
            for i in range(n):
                for j in range(i + 1, n):
                    res += almost_equal(i, j)
            return res
    return Solution2,


@app.cell
def __():
    from collections import Counter
    from itertools import combinations
    return Counter, combinations


@app.cell
def __(Counter, List, combinations):
    class Solution:
        def countPairs(self, nums: List[int]) -> int:
            frq = Counter()
            for x in nums:
                frq[x] += 1
                x = list(str(x).zfill(7))  # pad to max length
                for i, j in combinations(range(7), 2):
                    if x[i] != x[j]:
                        x[i], x[j] = x[j], x[i]
                        frq[int("".join(x))] += 1
                        x[i], x[j] = x[j], x[i]
            res = sum(frq[x] - 1 for x in nums) // 2  # -1 to remove self, // 2 because of symmetry
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countPairs([3,12,30,17,21]) == 2
    return


@app.cell
def __(sol):
    assert sol.countPairs([1,1,1,1,1]) == 10
    return


@app.cell
def __(sol):
    assert sol.countPairs([123,231]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
