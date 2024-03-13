import marimo

__generated_with = "0.3.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2423](https://leetcode.com/problems/remove-letter-to-equalize-frequency)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def equalFrequency(self, word: str) -> bool:
            cnt = Counter(word)
            most = cnt.most_common()
            ma, mi = most[0][0], most[-1][0]
            res = (
                cnt[ma] == 1 or all(i == ma or cnt[i] == cnt[ma] - 1 for i in cnt) or
                (cnt[mi] == 1 and all(i == mi or cnt[i] == cnt[ma] for i in cnt))
            )
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.equalFrequency("abcc")
    return


@app.cell
def __(sol):
    assert not sol.equalFrequency("aazz")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
