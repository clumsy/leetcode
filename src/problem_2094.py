import marimo

__generated_with = "0.4.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2094](https://leetcode.com/problems/finding-3-digit-even-numbers)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(List):
    class Solution2:
        def findEvenNumbers(self, digits: List[int]) -> List[int]:
            digits.sort()

            res = []
            def dfs(i, s):
                if len(s) == 3:
                    num = int("".join(str(i) for i in s))
                    res.append(num)
                    return
                digits[i] = None
                for j, d in enumerate(digits):
                    if j > 0 and d == digits[j - 1]:
                        continue
                    if d is not None and (len(s) == 1 or d & 1 == 0):
                        s.append(d)
                        dfs(j, s)
                        s.pop()
                digits[i] = s[-1]

            for i, d in enumerate(digits):
                if d > 0:
                    dfs(i, [d])

            res = sorted(set(res))
            return res
    return Solution2,


@app.cell
def __(Counter, List):
    class Solution:
        def findEvenNumbers(self, digits: List[int]) -> List[int]:
            res, cnt = [], Counter(digits)
            for i in range(1, 10):
                for j in range(0, 10):
                    for k in range(0, 10, 2):
                        if cnt[i] > 0 and cnt[j] > (i == j) and cnt[k] > (k == i) + (k == j):
                            res.append(i * 100 + j * 10 + k)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findEvenNumbers([2,1,3,0]) == [102,120,130,132,210,230,302,310,312,320]
    return


@app.cell
def __(sol):
    assert sol.findEvenNumbers([2,2,8,8,2]) == [222,228,282,288,822,828,882]
    return


@app.cell
def __(sol):
    assert sol.findEvenNumbers([3,7,5]) == []
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
