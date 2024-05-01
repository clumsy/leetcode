import marimo

__generated_with = "0.4.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 953](https://leetcode.com/problems/verifying-an-alien-dictionary)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def isAlienSorted(self, words: List[str], order: str) -> bool:
            mapping = {c: i for i, c in enumerate(order)}
            for a, b in zip(words, words[1:]):
                if len(a) > len(b) and a[:len(b)] == b:
                    return False
                for s1, s2 in zip(a, b):
                    if mapping[s1] < mapping[s2]:
                        break
                    elif mapping[s1] > mapping[s2]:
                        return False
            return True
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isAlienSorted(words=["hello","leetcode"], order="hlabcdefgijkmnopqrstuvwxyz")
    return


@app.cell
def __(sol):
    assert not sol.isAlienSorted(words=["word","world","row"], order="worldabcefghijkmnpqstuvxyz")
    return


@app.cell
def __(sol):
    assert not sol.isAlienSorted(words=["apple","app"], order="abcdefghijklmnopqrstuvwxyz")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
