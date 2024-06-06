import marimo

__generated_with = "0.6.15"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(rf"[Problem 3170](https://leetcode.com/problems/lexicographically-minimum-string-after-removing-stars)")
    return


@app.cell
def __():
    from heapq import heappush, heappop
    return heappop, heappush


@app.cell
def __(heappop, heappush):
    class Solution2:
        def clearStars(self, s: str) -> str:
            max_q,s  = [], list(s)
            for i, c in enumerate(s):
                if c == "*":
                    _, j = heappop(max_q)
                    s[i] = s[-j] = ""
                else:
                    heappush(max_q, (c, -i))
            res = "".join(s)
            return res
    return Solution2,


@app.cell
def __():
    from collections import defaultdict
    return defaultdict,


@app.cell
def __(defaultdict, heappop, heappush):
    class Solution:
        def clearStars(self, s: str) -> str:
            miq, idxs, s, saw = [], defaultdict(list), list(s), set()
            for i, c in enumerate(s):
                if c == "*":
                    dc = miq[0]
                    j = idxs[dc].pop()
                    if not idxs[dc]:
                        heappop(miq)
                        saw.remove(dc)
                    s[i] = s[j] = ""
                else:
                    idxs[c].append(i)
                    if not c in saw:
                        saw.add(c)
                        heappush(miq, c)
            res = "".join(s)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.clearStars("aaba*") == "aab"
    return


@app.cell
def __(sol):
    assert sol.clearStars("abc") == "abc"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
