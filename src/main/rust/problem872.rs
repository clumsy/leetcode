use std::cell::RefCell;
use std::panic::resume_unwind;
use std::rc::Rc;

use Solution;

#[derive(Debug, PartialEq, Eq)]
pub struct TreeNode {
  pub val: i32,
  pub left: Option<Rc<RefCell<TreeNode>>>,
  pub right: Option<Rc<RefCell<TreeNode>>>,
}

impl TreeNode {

  #[inline]
  pub fn new(val: i32) -> Self {
    TreeNode {
      val,
      left: None,
      right: None
    }
  }
}

impl Solution {
    pub fn leaf_similar(
        root1: Option<Rc<RefCell<TreeNode>>>,
        root2: Option<Rc<RefCell<TreeNode>>>
    ) -> bool {
        let sequence1 = Solution::get_leaf_value_sequence(&root1);
        let sequence2 = Solution::get_leaf_value_sequence(&root2);
        return sequence1.eq(&sequence2)
    }

    fn get_leaf_value_sequence(tree: &Option<Rc<RefCell<TreeNode>>>) -> Vec<i32> {
        let mut sequence: Vec<i32> = vec![];
        {
            Solution::_get_leaf_value_sequence(tree, &mut sequence);
        }
        sequence
    }

    fn _get_leaf_value_sequence<'a>(tree: &'a Option<Rc<RefCell<TreeNode>>>, sequence: &'a mut Vec<i32>) -> &'a mut Vec<i32> {
        match tree {
            Some(node) => {
                let tree_node = node.borrow();
                if tree_node.left.is_none() && tree_node.right.is_none() {
                    sequence.push(tree_node.val);
                }
                if tree_node.left.is_some() {
                    Solution::_get_leaf_value_sequence(&tree_node.left, sequence);
                }
                if tree_node.right.is_some() {
                    Solution::_get_leaf_value_sequence(&tree_node.right, sequence);
                }
                sequence
            },
            None => sequence
        }
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn gets_leaf_value_sequence() {
        let mut root = TreeNode::new(3);

        let mut two = TreeNode::new(2);
        two.left = Some(Rc::new(RefCell::new(TreeNode::new(7))));
        two.right = Some(Rc::new(RefCell::new(TreeNode::new(4))));

        let mut five = TreeNode::new(5);
        five.left = Some(Rc::new(RefCell::new(TreeNode::new(6))));
        five.right = Some(Rc::new(RefCell::new(two)));
        root.left = Some(Rc::new(RefCell::new(five)));

        let mut one = TreeNode::new(1);
        one.left = Some(Rc::new(RefCell::new(TreeNode::new(9))));
        one.right = Some(Rc::new(RefCell::new(TreeNode::new(8))));
        root.right = Some(Rc::new(RefCell::new(one)));
        assert_eq!(Solution::get_leaf_value_sequence(&Some(Rc::new(RefCell::new(root)))),
                   vec![6, 7, 4, 9, 8])
    }

    #[test]
    fn detects_similar_leaf_sequence() {
        let mut root1 = TreeNode::new(3);

        {
            let mut two = TreeNode::new(2);
            two.left = Some(Rc::new(RefCell::new(TreeNode::new(7))));
            two.right = Some(Rc::new(RefCell::new(TreeNode::new(4))));

            let mut five = TreeNode::new(5);
            five.left = Some(Rc::new(RefCell::new(TreeNode::new(6))));
            five.right = Some(Rc::new(RefCell::new(two)));
            root1.left = Some(Rc::new(RefCell::new(five)));

            let mut one = TreeNode::new(1);
            one.left = Some(Rc::new(RefCell::new(TreeNode::new(9))));
            one.right = Some(Rc::new(RefCell::new(TreeNode::new(8))));
            root1.right = Some(Rc::new(RefCell::new(one)));
        }


        let mut root2 = TreeNode::new(3);

        {
            let mut two = TreeNode::new(2);
            two.left = Some(Rc::new(RefCell::new(TreeNode::new(9))));
            two.right = Some(Rc::new(RefCell::new(TreeNode::new(8))));

            let mut five = TreeNode::new(5);
            five.left = Some(Rc::new(RefCell::new(TreeNode::new(6))));
            five.right = Some(Rc::new(RefCell::new(TreeNode::new(7))));
            root2.left = Some(Rc::new(RefCell::new(five)));

            let mut one = TreeNode::new(1);
            one.left = Some(Rc::new(RefCell::new(TreeNode::new(4))));
            one.right = Some(Rc::new(RefCell::new(two)));
            root2.right = Some(Rc::new(RefCell::new(one)));
        }

        assert_eq!(
            Solution::leaf_similar(
                Some(Rc::new(RefCell::new(root1))),
                Some(Rc::new(RefCell::new(root2)))), true);
    }
}
