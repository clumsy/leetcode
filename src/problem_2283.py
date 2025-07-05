class Solution:
    def digitCount(self, num: str) -> bool:
        cnt = Counter(num)
        res = all(cnt.get(str(i), 0) == int(num[i]) for i in range(len(num)))
        return res
