class Solution:
    def isWinner(self, player1: List[int], player2: List[int]) -> int:
        diff = 0
        def inc(p, i):
            return p[i] * (2 if max(p[max(0, i - 2):i], default=0) == 10 else 1)
        for i in range(len(player1)):
            diff += inc(player1, i) - inc(player2, i)
        res = 1 if diff > 0 else 2 if diff < 0 else 0
        return res
