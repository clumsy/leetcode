class Cashier:
    def __init__(self, n: int, discount: int, products: List[int], prices: List[int]):
        self.nth = n
        self.dis = discount
        self.pro = {k: v for k, v in zip(products, prices)}
        self.cur = 0

    def getBill(self, product: List[int], amount: List[int]) -> float:
        res = 0
        for i, p in enumerate(product):
            res += self.pro[p] * amount[i]
        self.cur = (self.cur + 1) % self.nth
        discount = self.dis if self.cur == 0 else 0
        return res * ((100 - discount) / 100)
