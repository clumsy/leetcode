class Solution:
    def numEquivDominoPairs(self, dominoes: List[List[int]]) -> int:
        count = 0
        equiv = defaultdict(lambda: defaultdict(int))
        for a, b in dominoes:  # it does not matter from which side to iterate
            a, b = min(a, b), max(a, b)
            count += equiv[a][b]
            equiv[a][b] += 1
        return count
