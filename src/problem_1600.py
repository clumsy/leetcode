class Node:
    def __init__(self, name):
        self.name = name
        self.childs = []


class ThroneInheritance:
    def __init__(self, kingName: str):
        self.dead = set()
        self.king = Node(kingName)
        self.family = {kingName: self.king}

    def birth(self, parentName: str, childName: str) -> None:
        child = Node(childName)
        self.family[parentName].childs.append(child)
        self.family[childName] = child

    def death(self, name: str) -> None:
        self.dead.add(name)

    def getInheritanceOrder(self) -> List[str]:
        res, st = [], deque([self.king])
        while st:
            cur = st.popleft()
            if cur.name not in self.dead:
                res.append(cur.name)
            for c in cur.childs[::-1]:
                st.appendleft(c)
        return res
