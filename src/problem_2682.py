class Solution:
    def circularGameLosers(self, n: int, k: int) -> List[int]:
        not_rcvd = set(range(1, n + 1))
        c = i = 0
        while True:
            c = (c + i * k) % n
            if c + 1 not in not_rcvd:
                break
            not_rcvd.remove(c + 1)
            i += 1
        res = sorted(not_rcvd)
        return res
