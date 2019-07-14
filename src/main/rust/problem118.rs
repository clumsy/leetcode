use Solution;

impl Solution {
    pub fn generate(num_rows: i32) -> Vec<Vec<i32>> {
        let mut res = Vec::new();
        for row in 0..num_rows as usize {
            res.push(vec![1; row + 1]);
            for col in 1..row {
                let prev = &res[row - 1];
                res[row][col] = prev[col - 1] + prev[col];
            }
        }
        return res;
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn simple() {
        assert_eq!(Solution::generate(5),
            vec![
                vec![1],
                vec![1, 1],
                vec![1, 2, 1],
                vec![1, 3, 3, 1],
                vec![1, 4, 6, 4, 1]]);
    }

    #[test]
    fn empty() {
        let empty: Vec<Vec<i32>> = Vec::new();
        assert_eq!(Solution::generate(0),
           empty);
    }
}
