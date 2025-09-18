class Solution:
    def getNumberOfBacklogOrders(self, orders: List[List[int]]) -> int:
        buys, sells = [], []
        for p, a, t in orders:
            if t == 0:  # a buy
                while sells and a:
                    sp, sa = sells[0]
                    if sp > p:
                        break
                    ma = min(sa, a)
                    sa -= ma
                    if sa == 0:
                        sells = sells[1:]
                    else:
                        sells[0][1] = sa
                    a -= ma
                if a > 0:
                    insort(buys, [p, a])
            else:  # a sell
                while buys and a:
                    bp, ba = buys[-1]
                    if bp < p:
                        break
                    ma = min(ba, a)
                    ba -= ma
                    if ba == 0:
                        buys = buys[:-1]
                    else:
                        buys[-1][1] = ba
                    a -= ma
                if a > 0:
                    insort(sells, [p, a])
        res = (sum(a for _, a in buys) + sum(a for _, a in sells)) % int(1e9 + 7)
        return res
