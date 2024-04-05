import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2490](https://leetcode.com/problems/circular-sentence)")
    return


@app.cell
def __():
    class Solution:
        def isCircularSentence(self, sentence: str) -> bool:
            res = sentence[0] == sentence[-1]
            if res:
                for i, c in enumerate(sentence):
                    if c == " " and sentence[i - 1] != sentence[i + 1]:
                        res = False
                        break
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isCircularSentence("leetcode exercises sound delightful")
    return


@app.cell
def __(sol):
    assert sol.isCircularSentence("eetcode")
    return


@app.cell
def __(sol):
    assert not sol.isCircularSentence("Leetcode is cool")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
