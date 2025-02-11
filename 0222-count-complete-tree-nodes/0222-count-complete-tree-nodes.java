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
//222. Count Complete Tree Nodes
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh=LeftHeight(root.left);
        int rh=RightHeight(root.right);
        if(lh==rh){ return (1<<(lh+1))-1;}
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int LeftHeight(TreeNode node){
        int count=0;
        while(node!=null){
            count++;
            node=node.left;
        }
        return count;
    }
    public int RightHeight(TreeNode node){
        int count=0;
        while(node!=null){
            count++;
            node=node.right;
        }
        return count;
    }
}
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