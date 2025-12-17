class Solution:
    def reformatNumber(self, number: str) -> str:
        res, number = [], number.replace(" ", "").replace("-", "")
        while number:
            n = len(number)
            if n > 4:
                res.append(number[:3])
                number = number[3:]
            elif n == 4:
                res.append(number[:2])
                res.append(number[2:])
                break
            else:
                res.append(number)
                break
        res = "-".join(res)
        return res
