package jingchen;

import dataStructure.TreeNode;

public class BinarySearchTreeIterator {
	private TreeNode firstNode;
    
    public BSTIterator(TreeNode root) {
        this.firstNode = tree2List(root);
    }
    
    private TreeNode tree2List(TreeNode root){
        if(root == null)
            return null;
        TreeNode left= tree2List(root.left);
        TreeNode right = tree2List(root.right);
        root.right = right;
        if(left != null){
            TreeNode first = left;
            while(left.right != null)
                left = left.right;
            left.right = root;
            return first;
        } else
            return root;
            
    }
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return firstNode != null;
    }

    /** @return the next smallest number */
    public int next() {
        int temp = firstNode.val;
        firstNode = firstNode.right;
        return temp;
    }
}
