package test;

import jingchen.SerializeandDeserializeBinaryTree;

import org.junit.Test;

import dataStructure.TreeNode;

public class testSerializeandDeserializeBinaryTree {
	@Test
	public void test01(){
		SerializeandDeserializeBinaryTree sd =new SerializeandDeserializeBinaryTree();
		TreeNode a = new TreeNode(-1);
		TreeNode b = new TreeNode(0);
		TreeNode c = new TreeNode(1);
		a.right = c;
		a.left = b;
		String s = sd.serialize(a);
		TreeNode root = sd.deserialize(s);
	}
}
