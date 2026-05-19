class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
        res, index = [], {s: i for i, s in enumerate(list1)}
        for i, s in enumerate(list2):
            j = index.get(s, None)
            if j is None:
                continue
            s = sum(res[0]) if res else inf
            if i + j == s:
                res.append((i, j))
            elif i + j < s:
                res = [(i, j)]
        res = [list2[i] for i, _ in res]
        return res
