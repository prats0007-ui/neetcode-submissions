/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null; 
        Stack<TreeNode> res= new Stack<>(); 

        res.push(root); 

        while(!res.isEmpty()){ 
            TreeNode node=res.pop();
            TreeNode temp=node.left; 
            node.left=node.right; 
            node.right=temp; 

            if(node.left!=null) res.push(node.left); 
            if(node.right!=null) res.push(node.right); 
        }
        return root;


    }
}