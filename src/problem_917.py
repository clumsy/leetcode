import marimo

__generated_with = "0.5.1"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 917](https://leetcode.com/problems/reverse-only-letters)")
    return


@app.cell
def __():
    class Solution:
        def reverseOnlyLetters(self, s: str) -> str:
            res, n = list(s), len(s)
            lo, hi = 0, n - 1
            while True:
                while lo < n and not res[lo].isalpha():
                    lo += 1
                while hi >= 0 and not res[hi].isalpha():
                    hi -= 1
                if lo < hi:
                    res[lo], res[hi] = res[hi], res[lo]
                    lo += 1
                    hi -= 1
                else:
                    break
            res = "".join(res)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.reverseOnlyLetters("ab-cd") == "dc-ba"
    return


@app.cell
def __(sol):
    assert sol.reverseOnlyLetters("a-bC-dEf-ghIj") == "j-Ih-gfE-dCba"
    return


@app.cell
def __(sol):
    assert sol.reverseOnlyLetters("Test1ng-Leet=code-Q!") == "Qedo1ct-eeLg=ntse-T!"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
