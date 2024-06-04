import marimo

__generated_with = "0.6.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 345](https://leetcode.com/problems/reverse-vowels-of-a-string)")
    return


@app.cell
def __():
    class Solution:
        def reverseVowels(self, s: str) -> str:
            s = list(s)
            vowels = "aeiou"
            i, j = 0, len(s) - 1
            while i < j:
                while i < j and s[i].lower() not in vowels:
                    i += 1
                while i < j and s[j].lower() not in vowels:
                    j -= 1
                if i < j:
                    s[i], s[j] = s[j], s[i]
                    i += 1
                    j -= 1
            res = "".join(s)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.reverseVowels("hello") == "holle"
    return


@app.cell
def __(sol):
    assert sol.reverseVowels("leetcode") == "leotcede"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
