class Solution {
    int max = 0;
    public int maxPathSum(TreeNode root) {
        help(root);
        return max;
    }
    public int help(TreeNode t){
        if(t == null){
            return 0;
        }
        int ls = Math.max(0 , help(t.left));
        int rs = Math.max(0 , help(t.right));
        int p = t.val + ls + rs;
        max = Math.max(max , p);
        return t.val + Math.max(ls , rs);
    }
}