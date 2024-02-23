import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 820](https://leetcode.com/problems/short-encoding-of-words)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution3:
        def minimumLengthEncoding(self, words: List[str]) -> int:
            res = []
            words.sort(key=len, reverse=True)
            for w in words:
                found = False
                for s in res:
                    i = len(s)
                    while not found and i >= 0: 
                        i = s.rfind(w, 0, i)
                        found = len(s) - i == len(w)
                    if found:
                        break
                if not found:
                    res.append(w)
            res = len("#".join(res)) + 1
            return res
    return Solution3,


@app.cell
def __(List):
    class Solution2:
        def minimumLengthEncoding(self, words: List[str]) -> int:
            root, lvs = {}, []
            for w in set(words):
                node = root
                for c in w[::-1]:
                    node[c] = node = node.get(c, {})
                lvs.append((node, len(w) + 1))
            res = sum(d for n, d in lvs if len(n) == 0)
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def minimumLengthEncoding(self, words: List[str]) -> int:
            res = set(words)
            for w in words:
                for i in range(1, len(w)):
                    res.discard(w[i:])
            res = sum(len(s) for s in res) + len(res)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumLengthEncoding(["time", "me", "bell"]) == 10
    return


@app.cell
def __(sol):
    assert sol.minimumLengthEncoding(["t"]) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
