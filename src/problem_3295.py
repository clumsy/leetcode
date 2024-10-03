import marimo

__generated_with = "0.8.22"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3295](https://leetcode.com/problems/report-spam-message)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution2:
        def reportSpam(self, m: List[str], bw: List[str]) -> bool:
            m.sort()
            bw.sort()
            res = i = j = 0
            while res < 2 and i < len(m) and j < len(bw):
                while j < len(bw) and bw[j] < m[i]:
                    j += 1
                while i < len(m) and j < len(bw) and m[i] <= bw[j]:
                    res += bw[j] == m[i]
                    i += 1
            res = res > 1
            return res
    return (Solution2,)


@app.cell
def __(List):
    class Trie:
        def __init__(self):
            self.nxt = {}
            self.trm = False

        def insert(self, w):
            n = self
            for c in w:
                nxt = n.nxt.get(c)
                if nxt is None:
                    nxt = Trie()
                n.nxt[c] = nxt
                n = nxt
            n.trm = True

        def contains(self, w):
            n = self
            for i, c in enumerate(w):
                if (nxt := n.nxt.get(c)) is None:
                    break
                if i == len(w) - 1:
                    return nxt.trm
                n = nxt
            return False

    class Solution:
        def reportSpam(self, m: List[str], bw: List[str]) -> bool:
            t = Trie()
            for w in bw:
                t.insert(w)
            res = 0
            for w in m:
                res += t.contains(w)
                if res == 2:
                    res = True
                    break
            else:
                res = False
            return res

    return Solution, Trie


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.reportSpam(["hello","world","leetcode"], ["world","hello"])
    return


@app.cell
def __(sol):
    assert not sol.reportSpam(["hello","programming","fun"], ["world","programming","leetcode"])
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
