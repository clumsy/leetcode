import marimo

__generated_with = "0.6.17"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 1255](https://leetcode.com/problems/maximum-score-words-formed-by-letters)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def maxScoreWords(self, words: List[str], letters: List[str], score: List[int]) -> int:
            res, cnt = 0, Counter(letters)
            for msk in range(1 << (len(words))):
                usd = Counter()
                for k in range(len(words)):
                    if usd is None:
                        break
                    if (msk & (1 << k)) == 1 << k:
                        for c in words[k]:
                            usd[c] += 1
                            if usd[c] > cnt[c]:
                                usd = None
                                break
                if usd is not None:
                    cur = sum(score[ord(c) - ord("a")] * u for c, u in usd.items())
                    res = max(res, cur)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxScoreWords(["dog","cat","dad","good"], ["a","a","c","d","d","d","g","o","o"], [1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0]) == 23
    return


@app.cell
def __(sol):
    assert sol.maxScoreWords(["xxxz","ax","bx","cx"], ["z","a","b","c","x","x","x"], [4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10]) == 27
    return


@app.cell
def __(sol):
    assert sol.maxScoreWords(["leetcode"], ["l","e","t","c","o","d"], [0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
