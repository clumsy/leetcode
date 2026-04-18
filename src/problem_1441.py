class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        res, top = [], 0
        for i in range(len(target)):
            diff = target[i] - top
            res.extend(["Push", "Pop"] * (diff - 1))
            res.append("Push")
            top = target[i]
        return res
