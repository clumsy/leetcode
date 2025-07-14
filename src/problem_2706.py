class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        m1 = m2 = inf
        for i in prices:
            if i < m1:
                m1, m2 = i, m1
            elif i < m2:
                m2 = i
        res = money - (m1 + m2 if m1 + m2 <= money else 0)
        return res
