class Solution:
    def strongPasswordCheckerII(self, password: str) -> bool:
        has_length = len(password) >= 8
        has_lower = has_upper = has_special = has_digit = False
        no_same = True
        for i, c in enumerate(password):
            has_lower |= c.islower()
            has_upper |= c.isupper()
            has_digit |= c.isdigit()
            has_special |= c in "!@#$%^&*()-+"
            no_same &= c != password[i - 1] if i > 0 else no_same
        res = has_length and has_lower and has_upper and has_digit and has_special and no_same
        return res
