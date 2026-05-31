class Solution:
    def judgeCircle(self, moves: str) -> bool:
        cnt = Counter(moves)
        res = cnt["U"] == cnt["D"] and cnt["L"] == cnt["R"]
        return res
