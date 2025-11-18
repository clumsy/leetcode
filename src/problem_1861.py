class Solution:
    def rotateTheBox(self, box: List[List[str]]) -> List[List[str]]:
        rs, cs = len(box), len(box[0])
        res = [["."] * rs for _ in range(cs)]
        for r in range(rs):
            last = cs - 1
            for c in range(cs)[::-1]:
                if box[r][c] == "*":
                    res[c][rs - r - 1], last = box[r][c], c - 1
                elif box[r][c] == "#":
                    res[last][rs - r - 1] = box[r][c]
                    last -= 1
        return res
