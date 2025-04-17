class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        num.reverse()
        carry, i = k, 0
        while carry:
            if len(num) <= i:
                num.append(0)
            carry, num[i] = divmod(num[i] + carry, 10)
            i += 1
        res = num[::-1]
        return res
