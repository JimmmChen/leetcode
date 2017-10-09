package jingchen;

import dataStructure.TreeNode;

public class SerializeandDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return serialize(root,"()");
    }
    
    private String serialize(TreeNode root, String s){
    		if(root == null)
    			return s;
    		String left = serialize(root.left,"()");
    		String right = serialize(root.right,"[]");
    		return s.substring(0,1)+root.val+left+right+s.substring(s.length()-1, s.length());
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    		if(data.length() == 2)
    			return null;
    		int i = 1,start;
    		while(data.charAt(i) != '(') i++;
    		start = i;
    		TreeNode root = new TreeNode(Integer.valueOf(data.substring(1, i)).intValue());
    		int count = -1;
    		for(i++;count < 0;i++){
    			if(data.charAt(i) == '(') count--;
    			else if(data.charAt(i) == ')') count++;
    		}
    		root.left = deserialize(data.substring(start, i));
    		root.right = deserialize(data.substring(i, data.length()-1));
    		return root;
    }
}
