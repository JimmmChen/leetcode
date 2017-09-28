package jingchen;

import dataStructure.TreeNode;

public class LowestCommonAncestorofaBinaryTree {
	TreeNode result = null;

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null)
			;
		else
			findTargetNode(root, p, q);
		return result;

	}

	private int findTargetNode(TreeNode root, TreeNode p, TreeNode q) {
		int leftflag = 0, rightflag = 0;
		if ((leftflag = findTargetNode(root.left, p, q)) == 2)
			return 2;
		if (root.right != null) {
			rightflag = findTargetNode(root.right, p, q);
			if (rightflag == 2)
				return 2;
		}
		if (leftflag + rightflag == 2) {
			result = root;
			return 2;
		}
		if (root == p || root == q) {
			if (leftflag == 0 && rightflag == 0)
				return 1;
			else {
				result = root;
				return 2;
			}
		} else
			return leftflag + rightflag;
	}
}
