class Solution:
    def validateCoupons(self, cs: List[str], bs: List[str], zs: List[bool]) -> List[str]:
        res, vbs = [], {"electronics", "grocery", "pharmacy", "restaurant"}
        for ci, bi, ai in zip(cs, bs, zs):
            if ci and ai and bi in vbs and ci.replace("_", "a").isalnum():
                res.append((bi, ci))
        res = [ci for bi, ci in sorted(res)]
        return res
