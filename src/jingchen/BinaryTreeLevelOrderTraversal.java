package jingchen;

import java.util.ArrayList;
import java.util.List;

import dataStructure.TreeNode;

public class BinaryTreeLevelOrderTraversal {
	  public List<List<Integer>> levelOrder(TreeNode root) {
		    List<List<Integer>> result = new ArrayList<>();
		    if(root == null)
		      return result;
		    dfs(result, root, 0);
		    return result;
		  }
		  
		  private void dfs(List<List<Integer>> result, TreeNode root, int idx){
		    if(root == null)
		      return;
		    if(idx >= result.size())
		      result.add(new ArrayList<Integer>());
		    result.get(idx).add(root.val);
		    dfs(result, root.left, idx+1);
		    dfs(result, root.right, idx+1);
		  }
}
