class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        res = ({d for _, d in paths} - {s for s, _ in paths}).pop()
        return res
