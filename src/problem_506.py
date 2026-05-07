class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        idx = list(range(0, len(score)))

        def cmp(a):
            return score[a]

        idx.sort(key=cmp, reverse=True)

        def place(a):
            if a == 0:
                return "Gold Medal"
            elif a == 1:
                return "Silver Medal"
            elif a == 2:
                return "Bronze Medal"
            else:
                return str(a + 1)

        result = [""] * len(score)
        for p, i in enumerate(idx):
            result[i] = place(p)
        return result
