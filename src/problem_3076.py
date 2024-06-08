import marimo

__generated_with = "0.6.17"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3076](https://leetcode.com/problems/shortest-uncommon-substring-in-an-array)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def shortestSubstrings(self, arr: List[str]) -> List[str]:
            cnt = Counter()
            for a in arr:
                for b in range(len(a)):
                    for e in range(b, len(a)):
                        cnt[a[b:e + 1]] += 1
            def natmin(s1, s2):
                if s1 == s2:
                    return s1
                if len(s2) < len(s1):
                    return s2
                elif len(s1) < len(s2):
                    return s1
                return min(s1, s2)
            res = [None] * len(arr)
            for i, a in enumerate(arr):
                cur, diff = None, Counter()
                for b in range(len(a)):
                    for e in range(b , len(a)):
                        s = a[b:e + 1]
                        cnt[s] -= 1
                        diff[s] += 1
                        if cnt[s] == 0:
                            cur = natmin(cur, s) if cur else s
                res[i] = cur or ""
                cnt.update(diff)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.shortestSubstrings(["cab","ad","bad","c"]) == ["ab","","ba",""]
    return


@app.cell
def __(sol):
    assert sol.shortestSubstrings(["abc","bcd","abcd"]) == ["","","abcd"]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
