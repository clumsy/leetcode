class Solution:
    def minimumOperationsToMakeEqual(self, x: int, y: int) -> int:
        used = set()
        q = deque([x])
        res = 0
        while True:
            for _ in range(len(q)):
                x = q.pop()
                if x == y:
                    break
                if x in used:
                    continue
                used.add(x)
                if x % 11 == 0:
                    q.appendleft(x // 11)
                if x % 5 == 0:
                    q.appendleft(x // 5)
                q.appendleft(x - 1)
                q.appendleft(x + 1)
            if x == y:
                break
            res += 1
        return res
