class Solution:
    def isEvenOddTree(self, root: Optional[TreeNode]) -> bool:
        levels, q, res, current, level = [], [], True, root, 0
        while True:
            if current:
                q.append((level, current))
                level += 1
                if len(levels) < level:
                    levels.append(inf if level & 1 == 0 else -inf)
                current = current.left
            elif q:
                level, current = q.pop()
                # processing start
                if (level & 1 == 0 and (current.val <= levels[level] or current.val & 1 == 0)) or (
                    level & 1 == 1 and (current.val >= levels[level] or current.val & 1 == 1)
                ):
                    res = False
                    break
                else:
                    levels[level] = current.val
                # processing end
                current = current.right
                level += 1
            else:
                break
        return res
