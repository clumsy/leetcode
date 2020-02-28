use Solution;

impl Solution {
    pub fn max_profit(prices: Vec<i32>) -> i32 {
        if prices.is_empty() {
            return 0;
        }
        let mut min = prices[0];
        let mut max = min;
        let mut diff = 0;
        for price in prices {
            if price < min {
                diff = std::cmp::max(diff, max - min);
                min = price;
                max = min;
            } else {
                max = std::cmp::max(max, price);
            }
        }
        std::cmp::max(diff, max - min)
    }
}

#[cfg(test)]
pub mod tests {
    use super::*;

    #[test]
    fn empty() {
        assert_eq!(Solution::max_profit(vec![]), 0);
    }

    #[test]
    fn first() {
        assert_eq!(Solution::max_profit(vec![4, 7, 2, 1]), 3);
    }

    #[test]
    fn buy() {
        assert_eq!(Solution::max_profit(vec![7, 1, 5, 3, 6, 4]), 5);
    }

    #[test]
    fn no_action() {
        assert_eq!(Solution::max_profit(vec![7, 6, 4, 3, 1]), 0);
    }
}