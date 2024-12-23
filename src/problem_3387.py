class Solution(object):
    def maxAmount(self, initialCurrency, pairs1, rates1, pairs2, rates2):
        def bellman(best, pairs, rates):
            for _ in pairs:
                for i, (f, t) in enumerate(pairs):
                    best[t] = max(best[t], best[f]*rates[i])
                    best[f] = max(best[f], best[t]/rates[i])
        
        best = defaultdict(int)
        best[initialCurrency] = 1
        bellman(best, pairs1, rates1)
        bellman(best, pairs2, rates2)
        return best[initialCurrency]

# class Solution:
#     def maxAmount(self, ic: str, p1: List[List[str]], r1: List[float], p2: List[List[str]], r2: List[float]) -> float:
#         cvrt = defaultdict(dict)
#         for i, (f, t) in enumerate(p1):
#             cvrt[f + "1"][t + "1"] = r1[i]
#             cvrt[t + "1"][f + "1"] = 1 / r1[i]
#             cvrt[f + "1"][f + "2"] = cvrt[t + "1"][t + "2"] = 1
#         for i, (f, t) in enumerate(p2):
#             cvrt[f + "2"][t + "2"] = r2[i]
#             cvrt[t + "2"][f + "2"] = 1 / r2[i]
#         d = defaultdict(int)
#         d[ic + "1"] = 1
#         q = [(ic + "1", 1)]
#         while q:
#             c, cv = q.pop()
#             for t, tv in cvrt[c].items():
#                 if cv * tv > d[t]:
#                     d[t] = cv * tv
#                     q.append((t, d[t]))
#         res = d[ic + "2"]
#         return res
