class Solution:
    def findWinners(self, matches: List[List[int]]) -> List[List[int]]:
        MAX = 1 + 10 ** 5
        lost = [None] * MAX
        for w, l in matches:
            lost[w] = 0 if lost[w] is None else lost[w]
            lost[l] = 1 + (0 if lost[l] is None else lost[l])
        res = [[], []]
        for p in range(1, 1 + 10 ** 5):
            if lost[p] == 0:
                res[0].append(p)
            elif lost[p] == 1:
                res[1].append(p)
        return res
