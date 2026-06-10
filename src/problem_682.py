class Solution:
    def calPoints(self, operations: List[str]) -> int:
        res = []
        for op in operations:
            if op == "D":
                res.append(2 * res[-1])
            elif op == "+":
                res.append(sum(res[-2:]))
            elif op == "C":
                res.pop()
            else:
                res.append(int(op))
        res = sum(res)
        return res
