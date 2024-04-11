import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3085](https://leetcode.com/problems/minimum-deletions-to-make-string-k-special)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def minimumDeletions(self, word: str, k: int) -> int:
            cnt = sorted(Counter(word).values())
            res, n = len(word), len(cnt)
            acc = 0
            for i, c in enumerate(cnt):
                if res < acc:
                    break
                j, cur = n - 1, 0
                # below can be a binary search
                while j >= i and cnt[j] - cnt[i] > k:
                    cur += (cnt[j] - max(cnt[j - 1], cnt[i] + k)) * (n - j)
                    j -= 1
                res = min(res, cur + acc)
                acc += c
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumDeletions("aabcaba", 0) == 3
    return


@app.cell
def __(sol):
    assert sol.minimumDeletions("dabdcbdcdcd", 2) == 2
    return


@app.cell
def __(sol):
    assert sol.minimumDeletions("aaabaaa", 2) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
