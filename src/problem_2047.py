import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2047](https://leetcode.com/problems/number-of-valid-words-in-a-sentence)")
    return


@app.cell
def __():
    import string
    return string,


@app.cell
def __(string):
    class Solution:
        def countValidWords(self, sentence: str) -> int:
            def is_word(w, hyphens=True):
                for p in [",", ".", "!"]:
                    if p in w and w.find(p) != len(w) - 1:
                        return False
                if "-" in w:
                    if not hyphens:
                        return False
                    chunks = w.split("-") 
                    if len(chunks) > 2 or any(len(c) == 0 for c in chunks) or any(c not in string.ascii_lowercase for c in (chunks[0][-1], chunks[1][0])):
                        return False
                    return all(is_word(c, hyphens=False) for c in chunks)
                return len(w) > 0 and all(c in string.ascii_lowercase or c in "!.," for c in w)
            res = sum(is_word(w) for w in sentence.split(" "))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countValidWords("cat and  dog") == 3
    return


@app.cell
def __(sol):
    assert sol.countValidWords("!this  1-s b8d!") == 0
    return


@app.cell
def __(sol):
    assert sol.countValidWords("alice and  bob are playing stone-game10") == 5
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
