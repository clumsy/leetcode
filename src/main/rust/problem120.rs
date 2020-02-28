use Solution;

impl Solution {
    pub fn minimum_total(triangle: Vec<Vec<i32>>) -> i32 {
        if triangle.len() < 1 {
            return 0
        }
        let mut level = vec![0; triangle.len()];
        let last = triangle.len() - 1;
        level.copy_from_slice(&triangle[last]);
        for row in (0..last).rev() {
            for i in 0..(row + 1) {
                level[i] = triangle[row][i] + std::cmp::min(level[i], level[i + 1]);
            }
        }
        level[0]
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn simple() {
        assert_eq!(Solution::minimum_total(
            vec![
                vec![2],
                vec![3,4],
                vec![6,5,7],
                vec![4,1,8,3]]), 11)
    }
}