package com.leetcode.second;

import com.dsalgo.TreeNode;

public class isSymmetricTree101 {
	

	public static void main(String[] args) {
      System.out.println(new isSymmetricTree101().isSymmetric(null));
	}
	public boolean isSymmetric(TreeNode root) {
		
		TreeNode lhs = root;
		TreeNode rhs = root;
		
		return dfs(lhs,rhs);
		
	}
	private boolean dfs(TreeNode lhs, TreeNode rhs) {
		if(lhs == null && rhs == null) {
			return true;
		}
		
		if(lhs == null || rhs == null) {
			return false;
		}
		
		if(lhs.val != rhs.val) {
			return false;
		}
		
		return dfs(lhs.left,rhs.right) &&
			   dfs(lhs.right,rhs.left);	
	}

}
