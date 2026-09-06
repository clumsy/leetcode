# class Solution:
#     def prefixConnected(self, ws: List[str], k: int) -> int:
#         rt, res = {}, 0
#         for w in ws:
#             cur, i = rt, 0
#             for c in w:
#                 if c not in cur:
#                     cur[c] = {}
#                 cur = cur[c]
#                 cur["cnt"] = cur.get("cnt", 0) + 1
#                 i += 1
#                 if i == k:
#                     res += cur["cnt"] == 2
#                     break
#         return res


class Solution:
    def prefixConnected(self, ws: List[str], k: int) -> int:
        cnt, res = defaultdict(int), 0
        for w in ws:
            if len(w) >= k:
                pfx = w[:k]
                cnt[pfx] += 1
                res += cnt[pfx] == 2
        return res
