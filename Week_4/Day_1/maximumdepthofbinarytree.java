class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int d1 = maxDepth(root.left);
        int d2 = maxDepth(root.right);
        return 1 + Math.max(d1 , d2);
    }
}