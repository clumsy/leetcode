import marimo

__generated_with = "0.6.17"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 2305](https://leetcode.com/problems/fair-distribution-of-cookies)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def distributeCookies(self, cookies: List[int], k: int) -> int:
            q = set([tuple([0] * k)])
            for _, e in enumerate(cookies):  # n times
                nxt = set()
                for cur in q:  # 2^k times
                    for i in range(k):  # k times
                        d = tuple(sorted([*cur[:i], cur[i] + e, *cur[i + 1:]]))
                        nxt.add(d)
                q = nxt
            res = min(max(d) for d in q)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.distributeCookies([8,15,10,20,8], 2) == 31
    return


@app.cell
def __(sol):
    assert sol.distributeCookies([6,1,3,2,2,4,1,2], 3) == 7
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
