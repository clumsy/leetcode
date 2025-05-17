class Solution:
    def findHighAccessEmployees(self, access_times: List[List[str]]) -> List[str]:
        access_times.sort()
        def mins(s):
            return int(s[:-2]) * 60 + int(s[-2:])
        res, cur, last = set(), None, deque()
        for e, t in access_times:
            if e != cur:
                last.clear()
                cur = e
            last.append(t)
            while mins(t) - mins(last[0]) >= 60:
                last.popleft()
            if len(last) > 2:
                res.add(e)
        return list(res)
