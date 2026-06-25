class Solution {
    int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        help(root);
        return d;
    }
    public int help(TreeNode t){
        if(t == null){
            return 0;
        }
        int lt = help(t.left);
        int rt = help(t.right);
        d = Math.max(d , lt + rt);
        return 1 + Math.max(lt , rt);
    }
}