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
class Solution {
     ArrayList<Integer> a =new ArrayList<Integer>();
        
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        Preorder(root);
        return a;
        
    }
    
    public void Preorder(TreeNode node){
        if(node==null)
            return;
        
        
        a.add(node.val);
        Preorder(node.left);
        Preorder(node.right);
        
    }
    
}