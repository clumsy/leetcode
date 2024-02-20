import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1935](https://leetcode.com/problems/maximum-number-of-words-you-can-type)")
    return


@app.cell
def __():
    class Solution:
        def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
            def mask(s):
                mask = 0
                for c in s:
                    mask |= 1 << (ord(c) - ord("a"))
                return mask
            broken = mask(brokenLetters)
            res = sum(broken & mask(w) == 0 for w in text.split())
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.canBeTypedWords("hello world", "ad") == 1
    return


@app.cell
def __(sol):
    assert sol.canBeTypedWords("leet code", "lt") == 1
    return


@app.cell
def __(sol):
    assert sol.canBeTypedWords("leet code", "le") == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
