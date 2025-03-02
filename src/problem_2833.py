class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        cnt = Counter(moves)
        res = abs(cnt["L"] - cnt["R"]) + cnt["_"]
        return res
