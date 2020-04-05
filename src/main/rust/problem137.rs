use Solution;

impl Solution {
    fn single_number2(nums: Vec<i32>) -> i32 {
        let mut x1 = 0;
        let mut x2 = 0;
        let mut mask = 0;
        for i in nums {
            x2 ^= x1 & i;
            x1 ^= i;
            mask = !(x1 & x2);
            x2 &= mask;
            x1 &= mask;
        }
        x1
    }
}

#[cfg(test)]
mod tests {
    use Solution;

    use super::*;

    #[test]
    fn simple() {
        assert_eq!(Solution::single_number2(vec![2, 2, 3, 2]), 3);
    }

    #[test]
    fn complex() {
        assert_eq!(Solution::single_number2(vec![0, 1, 0, 1, 0, 1, 99]), 99);
    }
}