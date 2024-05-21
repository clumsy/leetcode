import marimo

__generated_with = "0.6.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3144](https://leetcode.com/problems/minimum-substring-partition-of-equal-character-frequency)")
    return


@app.cell
def __():
    from functools import cache
    from collections import Counter
    return Counter, cache


@app.cell
def __(Counter, cache):
    class Solution2:

        @cache
        def minimumSubstringsInPartition(self, s: str) -> int:
            n = len(s)
            if n <= 1:
                return n
            cnt, res = Counter(), n
            for i in range(n):
                cnt[s[i]] += 1
                if len(set(cnt.values())) == 1:
                    res = min(res, 1 + self.minimumSubstringsInPartition(s[i + 1:]))
            return res
    return Solution2,


@app.cell
def __():
    from collections import defaultdict
    return defaultdict,


@app.cell
def __(defaultdict):
    class Solution:
        def minimumSubstringsInPartition(self, s: str) -> int:
            n = len(s)
            if n <= 1:
                return n
            dp, res = [n] * (n + 1), n
            dp[-1] = 0
            for i in reversed(range(n)):
                cnt, ma, unq = defaultdict(int), 0, 0
                for j in range(1, n + 1 - i):
                    c = s[i + j - 1]
                    cnt[c] += 1
                    unq += cnt[c] == 1
                    ma = max(ma, cnt[c])
                    if j == unq * ma:
                        dp[i] = min(dp[i], 1 + dp[i + j])
            return dp[0]
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumSubstringsInPartition("fabccddg") == 3
    return


@app.cell
def __(sol):
    assert sol.minimumSubstringsInPartition("abababaccddb") == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
