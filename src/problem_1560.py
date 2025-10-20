class Solution:
    def mostVisited(self, n: int, rounds: List[int]) -> List[int]:
        left, right = rounds[0], rounds[-1]
        res = (
            [i for i in range(left, right + 1)]
            if right >= left
            else [i for i in range(1, right + 1)] + [i for i in range(left, n + 1)]
        )
        return res
