class Solution:
    def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:
        hand.sort()
        res, cnt = True, Counter(hand)
        for h in hand:
            if not res:
                break
            if cnt[h] > 0:
                for i in range(groupSize):
                    if cnt[h + i] == 0:
                        res = False
                        break
                    cnt[h + i] -= 1
        return res
