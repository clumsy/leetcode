use Solution;

impl Solution {
    pub fn single_number(nums: Vec<i32>) -> i32 {
        let mut sum = 0;
        for x in nums {
            sum ^= x;
        }
        sum
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn last() {
        assert_eq!(Solution::single_number(vec![2, 2, 1]), 1);
    }

    #[test]
    fn first() {
        assert_eq!(Solution::single_number(vec![4, 1, 2, 1, 2]), 4);
    }

    #[test]
    fn zero() {
        assert_eq!(Solution::single_number(vec![1, 0, 1]), 0);
    }
}
