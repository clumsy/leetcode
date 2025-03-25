class Solution:
    def buddyStrings(self, s: str, goal: str) -> bool:
        diff = sum(a != b for a, b in zip(s, goal))
        cnt_s = Counter(s)
        res = cnt_s == Counter(goal) and (diff == 2 or (diff == 0 and cnt_s.most_common()[0][1] > 1))
        return res
