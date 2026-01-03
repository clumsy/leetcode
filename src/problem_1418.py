class Solution:
    def displayTable(self, orders: List[List[str]]) -> List[List[str]]:
        tables, foods = defaultdict(Counter), set()
        for _, t, f in orders:
            tables[int(t)][f] += 1
            foods.add(f)
        res = [["Table"] + sorted(foods)]
        for t in sorted(tables.keys()):
            res.append([str(t)] + [str(tables[t][f]) for f in res[0][1:]])
        return res
