package test;

import jingchen.LowestCommonAncestorofaBinaryTree;

import org.junit.Test;

import dataStructure.TreeNode;

public class testLowCommonAncestorofaBinaryTree {
	@Test
	public void test01(){
		TreeNode a = new TreeNode(0);
		TreeNode b = new TreeNode(1);
		TreeNode c = new TreeNode(2);
		a.left = b;
		a.right = c;
		LowestCommonAncestorofaBinaryTree lcbt = new LowestCommonAncestorofaBinaryTree();
		TreeNode d = lcbt.lowestCommonAncestor(a, b, c);
		System.out.println(d.val);
	}
}
