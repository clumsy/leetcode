class Solution:
    def findReplaceString(self, s: str, indices: List[int], sources: List[str], targets: List[str]) -> str:
        n, res, end = len(indices), [], 0
        order = sorted(range(n), key=indices.__getitem__)
        for i in order:
            res.append(s[end:indices[i]])
            end = indices[i]
            if s.startswith(sources[i], indices[i]):
                res.append(targets[i])
                end += len(sources[i])
        res.append(s[end:])
        res = "".join(res)
        return res
