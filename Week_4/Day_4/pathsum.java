class Solution {
    public boolean hasPathSum(TreeNode root, int ts) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return ts == root.val;
        }
        return hasPathSum(root.left , ts - root.val) || hasPathSum(root.right , ts - root.val);
    }
}