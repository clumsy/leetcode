class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        n, st = len(prices), []
        res = [0] * n
        for i in range(n)[::-1]:
            while st and st[-1] > prices[i]:
                st.pop()
            res[i] = prices[i] - (st[-1] if st and st[-1] <= prices[i] else 0)
            st.append(prices[i])
        return res
