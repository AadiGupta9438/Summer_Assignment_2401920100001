class Solution {
    public boolean isValidBST(TreeNode root) {
        return help(root , Long.MAX_VALUE , Long.MIN_VALUE);
    }
    public boolean help(TreeNode t , long max , long min){
        if(t == null){
            return true;
        }
        if(t.val <= min || t.val >= max){
            return false;
        }
        return help(t.left , t.val , min) && help(t.right , max , t.val);
    }
}