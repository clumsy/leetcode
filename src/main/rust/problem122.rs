use Solution;

impl Solution {
    pub fn max_profit2(prices: Vec<i32>) -> i32 {
        if prices.is_empty() {
            return 0
        }
        let mut current = prices[0];
        let mut min = current;
        let mut max = current;
        let mut total = 0;
        for day in 1..prices.len() {
            let price = prices[day];
            if price < current {
                total += max - min;
                min = price;
                max = price;
            } else {
                max = std::cmp::max(max, price);
            }
            current = price;
        }
        total + (max - min)
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn empty() {
        assert_eq!(Solution::max_profit2(vec![]), 0);
    }

    #[test]
    fn buy_twice() {
        assert_eq!(Solution::max_profit2(vec![7, 1, 5, 3, 6, 4]), 7);
    }

    #[test]
    fn buy_once() {
        assert_eq!(Solution::max_profit2(vec![1, 2, 3, 4, 5]), 4);
    }

    #[test]
    fn buy_none() {
        assert_eq!(Solution::max_profit2(vec![7, 6, 4, 3, 1]), 0);
    }
}