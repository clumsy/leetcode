use Solution;

impl Solution {
    pub fn get_row(row_index: i32) -> Vec<i32> {
        let mut level = vec![1; (row_index + 1) as usize];
        let mut tmp = vec![1; (row_index + 1) as usize];
        for row in 0..row_index as usize {
            for i in 0..row as usize {
                tmp[i + 1] = level[i] + level[i + 1];
            }
            std::mem::swap(&mut level, &mut tmp);
        }
        level
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn simple() {
        assert_eq!(Solution::get_row(3), vec![1, 3, 3, 1]);
    }
}
