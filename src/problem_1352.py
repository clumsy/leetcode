class ProductOfNumbers:
    def __init__(self):
        self.curr_prod = [1]


    def add(self, num: int) -> None:
        if num == 0:
            self.__init__()
        else:
            self.curr_prod.append(num * self.curr_prod[-1])

    def getProduct(self, k: int) -> int:
        res = 0 if k >= len(self.curr_prod) else self.curr_prod[-1] // self.curr_prod[-k - 1]
        return res
