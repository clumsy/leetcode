import marimo

__generated_with = "0.4.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3006](https://leetcode.com/problems/find-beautiful-indices-in-the-given-array-i)")
    return


@app.cell
def __():
    from typing import List
    from bisect import bisect_left
    return List, bisect_left


@app.cell
def __(List, bisect_left):
    class Solution2:
        def beautifulIndices(self, s: str, a: str, b: str, k: int) -> List[int]:
            p, m = 991, 997  # mutually prime at least, using 2 primes
            def hash(x):
                n, res = len(x), 0
                for c in x:
                    res = (res * p + ord(c)) % m
                return res
            def rolling_hash(x, t):
                res = []
                h, n, cur = hash(t), len(t), 0
                for i, c in enumerate(x):
                    cur = cur * p + ord(c)
                    if i >= n:
                        cur -= ord(x[i - n]) * (p ** n)
                    cur %= m
                    if cur == h and i >= n - 1 and x[i - n + 1:i + 1] == t:
                        res.append(i - n + 1)
                return res
            rh = rolling_hash(s, b)
            res = []
            h, n, cur = hash(a), len(a), 0
            for i, c in enumerate(s):
                cur = cur * p + ord(c)
                if i >= n:
                    cur -= ord(s[i - n]) * (p ** n)
                cur %= m
                if cur == h and i >= n - 1 and s[i - n + 1:i + 1] == a:
                    b = i - n + 1
                    j = bisect_left(rh, max(0, b - k))
                    if j < len(rh) and abs(b - rh[j]) <= k:
                        res.append(b)
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def beautifulIndices(self, s: str, a: str, b: str, k: int) -> List[int]:
            def kmp(x):
                p = [0] * len(x)
                for i in range(1, len(x)):
                    j = p[i - 1]
                    while j and x[i] != x[j]:
                        j = p[j - 1]
                    p[i] = j + (x[i] == x[j])
                return p
            pa = kmp(a + "#" + s)
            pb = kmp(b + "#" + s)
            la, lb = len(a), len(b)
            si = [i - 2 * la for i, pi in enumerate(pa) if pi >= la]
            sj = [j - 2 * lb for j, pj in enumerate(pb) if pj >= lb]
            res = []
            j = 0
            for i in si:
                while j < len(sj) and sj[j] < i - k:
                    j += 1
                if j < len(sj) and sj[j] <= i + k:
                    res.append(i)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.beautifulIndices("isawsquirrelnearmysquirrelhouseohmy", "my", "squirrel", 15) == [16,33]
    return


@app.cell
def __(sol):
    assert sol.beautifulIndices("abcd", "a", "a", 4) == [0]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
