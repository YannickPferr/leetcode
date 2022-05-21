package trees.easy;

import trees.TreeNode;

/**
 * Problem: 235. Lowest Common Ancestor of a Binary Search Tree
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class LowestCommonAncestorOfABST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        if (root.val < Math.min(p.val, q.val))
            return lowestCommonAncestor(root.right, p, q);
        else if (root.val > Math.max(p.val, q.val))
            return lowestCommonAncestor(root.left, p, q);
        else
            return root;
    }
}
