class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        c_st = Counter(students)
        for s in sandwiches:
            if c_st.get(s, 0) == 0:
                break
            c_st[s] -= 1
        res = c_st.total()
        return res
