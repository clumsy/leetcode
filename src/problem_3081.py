import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3081](https://leetcode.com/problems/replace-question-marks-in-string-to-minimize-its-value)")
    return


@app.cell
def __():
    import string
    from heapq import heapify, heappop, heappush
    from collections import Counter
    return Counter, heapify, heappop, heappush, string


@app.cell
def __(Counter, heapify, heappop, heappush, string):
    class Solution2:
        def minimizeStringValue(self, s: str) -> str:
            cnt = Counter(s)
            q = [(cnt[c], c) for c in string.ascii_lowercase]
            heapify(q)
            cnt.clear()
            for i, c in enumerate(s):
                if c == "?":
                    k, c = heappop(q)
                    cnt[c] += 1
                    heappush(q, (k + 1, c))
            s = list(s)
            for i, c in enumerate(s):
                if c == "?":
                    for c in string.ascii_lowercase:
                        if cnt[c] > 0:
                            s[i] = c
                            cnt[c] -= 1
                            break
            res = "".join(s)
            return res
    return Solution2,


@app.cell
def __(Counter, string):
    class Solution:
        def minimizeStringValue(self, s: str) -> str:
            cnt, ins = Counter(s), Counter()
            while cnt["?"] > 0:
                c = min(string.ascii_lowercase, key=cnt.__getitem__)
                cnt["?"] -= 1
                cnt[c] += 1
                ins[c] += 1
            j, s = 0, list(s)
            for i, c in enumerate(s):
                if c == "?":
                    while ins[string.ascii_lowercase[j]] == 0:
                        j += 1
                    c = string.ascii_lowercase[j]
                    ins[c] -= 1
                    s[i] = c
            res = "".join(s)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimizeStringValue("???") == "abc"
    return


@app.cell
def __(sol):
    assert sol.minimizeStringValue("a?a?") == "abac"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
